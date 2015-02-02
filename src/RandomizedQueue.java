import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Alexey Kutepov on 01.02.15.
 */
public class RandomizedQueue<Item> implements Iterable<Item> {

    private Node first;
    private Node last;
    private int count;

    private class Node {
        Item item;
        Node next;
    }

    /**
     * construct an empty randomized queue
     */
    public RandomizedQueue() {
        first = null;
        last = null;
        count = 0;
    }

    /**
     * is the queue empty?
     * @return true? when queue is empty
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * @return the number of items on the queue
     */
    public int size() {
        return count;
    }

    /**
     * add the item
     * @param item - input item
     */
    public void enqueue(Item item) {
        if (item == null) {
            throw new NullPointerException();
        }
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
          first = last;
        } else {
          oldLast.next = last;
        }
        count++;
    }

    /**
     * delete and return a random item
     * @return a random item
     */
    public Item dequeue() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        int number = StdRandom.uniform(0, count);
        Node prev = null;
        Node current = first;
        for (int i = 0; i <= number; i++) {
            if (i != number) {
                prev = current;
                current = current.next;
            }
        }
        Item item = current.item;
        current = current.next;
        if (isEmpty()) {
          last = null;
        } else if (prev != null) {
            prev.next = current;
        }
        count--;
        return item;
    }

    /**
     *
     * @return (but do not delete) a random item
     */
    public Item sample() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        int number = StdRandom.uniform(0, count);
        Node current = first;
        for (int i = 0; i <= number; i++) {
            if (i != number) {
                current = current.next;
            }
        }
        return current.item;
    }

    /**
     * @return an independent iterator over items in random order
     */
    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>  {
        private Node current = first;
        public boolean hasNext() { return current != null; }
        public void remove() {
            throw new UnsupportedOperationException();
        }
        public Item next()
        {
            if (current == null) {
                throw new NoSuchElementException();
            }
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    /**
     * unit testing
     * @param args - args
     */
    public static void main(String[] args) {

    }
}

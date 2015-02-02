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
        private Item item;
        private Node next;

        public Item getItem() {
            return item;
        }

        public void setItem(Item item) {
            this.item = item;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
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
        last.setItem(item);
        last.setNext(null);
        if (isEmpty()) {
          first = last;
        } else {
          oldLast.setNext(last);
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
        int number = StdRandom.uniform(count);
        Node prev = null;
        Node current = first;
        for (int i = 0; i <= number; i++) {
            if (i != number) {
                prev = current;
                current = current.getNext();
            }
        }
        Item item = current.getItem();
        current = current.getNext();
        if (prev == null) {
            first = current;
        } else {
            prev.setNext(current);
        }
        if (current == null) {
            last = prev;
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
        int number = StdRandom.uniform(count);
        Node current = first;
        for (int i = 0; i <= number; i++) {
            if (i != number) {
                current = current.getNext();
            }
        }
        return current.getItem();
    }

    /**
     * @return an independent iterator over items in random order
     */
    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>  {
        private Object[] mas;
        private int count;
        private ListIterator() {
            mas = new Object[size()];
           Node current = first;
            for (int i = 0; i < mas.length; i++) {
                mas[i] = current.getItem();
                current = current.getNext();
            }
            StdRandom.shuffle(mas);
          count = 0;
        }

        public boolean hasNext() { return count != mas.length; }
        public void remove() {
            throw new UnsupportedOperationException();
        }
        public Item next()
        {
            if (count == mas.length) {
                throw new NoSuchElementException();
            }
            Item item = (Item) mas[count];
            count++;
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

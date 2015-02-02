import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Alexey Kutepov on 01.02.15.
 */
public class Deque<Item> implements Iterable<Item> {

    private Node first;
    private Node last;
    private int count;

    private class Node {
        Item item;
        Node next;
        Node back;
    }

    /**
     * construct an empty deque
     */
    public Deque() {
        this.first = null;
        this.last = null;
        this.count = 0;
    }

    /**
     * is the deque empty?
     * @return true, where deque is empty
     */
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * @return the number of items on the deque
     */
    public int size() {
        return count;
    }

    /**
     * insert the item at the front
     * @param item - input item
     */
    public void addFirst(Item item) {
        if (item == null) {
            throw new NullPointerException();
        }
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        if (oldFirst == null) {
            last = first;
        } else {
            oldFirst.back = first;
        }
        count++;
    }

    /**
     * insert the item at the end
     * @param item - input item
     */
    public void addLast(Item item) {
        if (item == null) {
            throw new NullPointerException();
        }
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.back = oldLast;
        if (oldLast == null) {
            first = last;
        } else {
          oldLast.next = last;
        }
        count++;
    }

    /**
     * delete and return the item at the front
     * @return the item at the front
     */
    public Item removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Item result = first.item;
        first = first.next;
        if (first == null) {
            last = null;
        } else {
          first.back = null;
          if (first.next == null) {
            last.back = null;
          }
        }
        count--;
        return result;
    }

    /**
     * delete and return the item at the end
     * @return the item at the end
     */
    public Item removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Item result = last.item;
        last = last.back;
        if (last == null) {
            first = null;
        } else {
          last.next = null;
          if (last.back == null) {
            first.next = null;
          }
        }
        count--;
        return result;
    }

    /**
     * @return an iterator over items in order from front to end
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

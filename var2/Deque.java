import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by kutepoval on 10.07.2014.
 */
public class Deque<Item> implements Iterable<Item> {

    private Node firstItem;
    private Node lastItem;
    private int length;

    private class Node {
        public Item item = null;
        public Node next = null;
        public Node prev = null;
    }

    private class DequeueIterator implements Iterator<Item> {
        private Node current = firstItem;

        @Override
        public boolean hasNext() {
            if (current==null) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Item next() {
            if (current==null) {
                throw new NoSuchElementException();
            } else {
                Item item = current.item;
                current = current.next;
                return item;
            }
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public Deque() {
        this.firstItem = null;
        this.lastItem = null;
        this.length = 0;
    }
    public boolean isEmpty() {
        return this.firstItem == null;
    }

    public int size() {
        return this.length;
    }

    public void addFirst(Item item) {
        if (item==null) {
            throw new NullPointerException("Item is null");
        }
        Node node = new Node();
        node.item = item;
        node.next = this.firstItem;
        node.prev = null;
        if (isEmpty()) {
            this.firstItem = node;
            this.lastItem = firstItem;
        } else {
            this.firstItem.prev = node;
            this.firstItem = firstItem.prev;
        }
        this.length++;
    }

    public void addLast(Item item) {
        if (item==null) {
            throw new NullPointerException("Item is null");
        }
        Node node = new Node();
        node.item = item;
        node.next = null;
        node.prev = lastItem;
        if (isEmpty()) {
            this.firstItem = node;
            this.lastItem = firstItem;
        } else {
            this.lastItem.next = node;
            this.lastItem = this.lastItem.next;
        }
        this.length++;
    }

    public Item removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Dequeue is empty");
        }
        Item item = this.firstItem.item;
        this.firstItem = this.firstItem.next;
        if (!isEmpty()) {
            this.firstItem.prev = null;
        } else {
            this.lastItem = null;
        }
        this.length--;
        return item;
    }

    public Item removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Dequeue is empty");
        }
        Item item = this.lastItem.item;
        this.lastItem = this.lastItem.prev;
        if (lastItem!=null) {
            this.lastItem.next = null;
        } else {
            firstItem = null;
        }
        this.length--;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new DequeueIterator();
    }


    public static void main(String[] args) {

    }
}

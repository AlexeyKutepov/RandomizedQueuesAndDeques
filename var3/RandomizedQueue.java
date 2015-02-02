import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

/**
 * Created by kutepoval on 10.07.2014.
 */
public class RandomizedQueue<Item> implements Iterable<Item> {

    private int length;
    private int n;
    private Item[] queue;
    private Random random;


    private class RandomizedQueueIterator implements Iterator<Item> {

        private int current = 0;

        @Override
        public boolean hasNext() {
            if (this.current==n) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Item next() {
            if (this.current==n) {
                throw new NoSuchElementException();
            } else {
                return queue[this.current++];
            }
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public RandomizedQueue() {
        this.queue = (Item[]) new Object[1];
        this.length = 1;
        this.n = 0;
        this.random = new Random();

        this.queue[0] = (Item)"das";
    }

    private void resize(int capacity) {
        Item[] itemList = (Item[]) new Object[capacity];
        for (int i = 0; i < this.n; i++) {
            itemList[i] = this.queue[i];
        }
        this.length = capacity;
        this.queue = itemList;
    }

    public boolean isEmpty() {
        return this.n == 0;
    }

    public int size() {
        return this.n;
    }

    public void enqueue(Item item) {
        if (item == null) {
            throw new NullPointerException();
        }
        if (this.length == this.n) {
            resize(2 * this.length);
        }
        this.queue[n++] = item;

    }

    public Item dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        int index = this.random.nextInt(n);
        Item item = this.queue[index];
        this.n--;
        this.queue[index] = this.queue[n];
        this.queue[n] = null;
        if (n > 0 && n == this.length/4)
            resize(this.length/2);
        return item;
    }

    public Item sample() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        int index = this.random.nextInt(n);
        return this.queue[index];
    }


    @Override
    public Iterator<Item> iterator() {
        return new RandomizedQueueIterator();
    }

    public static void main(String[] args) {

    }
}

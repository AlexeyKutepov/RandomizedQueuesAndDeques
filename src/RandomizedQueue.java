import java.util.Iterator;

/**
 * Created by Alexey Kutepov on 01.02.15.
 */
public class RandomizedQueue<Item> implements Iterable<Item> {

    /**
     * construct an empty randomized queue
     */
    public RandomizedQueue() {
    }

    /**
     * is the queue empty?
     * @return true? when queue is empty
     */
    public boolean isEmpty() {
        return true;
    }

    /**
     * @return the number of items on the queue
     */
    public int size() {
        return 0;
    }

    /**
     * add the item
     * @param item - input item
     */
    public void enqueue(Item item) {

    }

    /**
     * delete and return a random item
     * @return a random item
     */
    public Item dequeue() {
        return null;
    }

    /**
     *
     * @return (but do not delete) a random item
     */
    public Item sample() {
        return null;
    }

    /**
     * @return an independent iterator over items in random order
     */
    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    /**
     * unit testing
     * @param args - args
     */
    public static void main(String[] args) {

    }
}

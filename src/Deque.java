import java.util.Iterator;

/**
 * Created by Alexey Kutepov on 01.02.15.
 */
public class Deque<Item> implements Iterable<Item> {

    /**
     * construct an empty deque
     */
    public Deque() {
    }

    /**
     * is the deque empty?
     * @return true, where deque is empty
     */
    public boolean isEmpty() {
        return true;
    }

    /**
     * @return the number of items on the deque
     */
    public int size() {
        return 0;
    }

    /**
     * insert the item at the front
     * @param item - input item
     */
    public void addFirst(Item item) {

    }

    /**
     * insert the item at the end
     * @param item - input item
     */
    public void addLast(Item item) {

    }

    /**
     * delete and return the item at the front
     * @return the item at the front
     */
    public Item removeFirst() {
        return null;
    }

    /**
     * delete and return the item at the end
     * @return the item at the end
     */
    public Item removeLast() {
        return null;
    }

    /**
     * @return an iterator over items in order from front to end
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

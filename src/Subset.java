/**
 * Created by Alexey Kutepov on 02.02.15.
 */
public class Subset {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        RandomizedQueue<String> rq = new RandomizedQueue<String>();
        while (!StdIn.isEmpty())
        {
            String item = StdIn.readString();
            rq.enqueue(item);
        }
        for (int i = 0; i < N; i++) {
            String item = rq.dequeue();
            StdOut.println(item);
        }
    }
}

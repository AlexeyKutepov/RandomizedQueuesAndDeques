public class Main {

    public static void main(String[] args) {
      RandomizedQueue<Integer> randomizedQueue = new RandomizedQueue<Integer>();
      StdOut.println("size = " + randomizedQueue.size());
      StdOut.println("isEmpty = " + randomizedQueue.isEmpty());
      StdOut.println("==============================================" );
      for (int i = 0; i < 10; i++) {
        int a = StdRandom.uniform(1000);
        StdOut.println("in = " + a);
        randomizedQueue.enqueue(a);
        StdOut.println("isEmpty = " + randomizedQueue.isEmpty());
        StdOut.println("size = " + randomizedQueue.size());
      }
      StdOut.println("==============================================" );
      for (int i = 0; i < 10; i++) {
        int a = StdRandom.uniform(1000);
        StdOut.println("in = " + a);
        StdOut.println("dequeue = " + randomizedQueue.dequeue());
        StdOut.println("isEmpty = " + randomizedQueue.isEmpty());
        StdOut.println("size = " + randomizedQueue.size());
      }
      StdOut.println("==============================================" );
      for (int i = 0; i < 10; i++) {
        int a = StdRandom.uniform(1000);
        StdOut.println("in = " + a);
        randomizedQueue.enqueue(a);
        StdOut.println("isEmpty = " + randomizedQueue.isEmpty());
        StdOut.println("size = " + randomizedQueue.size());
      }
      StdOut.println("==============================================" );
      for (int i = 0; i < 11; i++) {
        int a = StdRandom.uniform(1000);
        StdOut.println("in = " + a);
        StdOut.println("dequeue = " + randomizedQueue.dequeue());
        StdOut.println("isEmpty = " + randomizedQueue.isEmpty());
        StdOut.println("size = " + randomizedQueue.size());
      }

    }
}

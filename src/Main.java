public class Main {

    public static void main(String[] args) {
      RandomizedQueue<Integer> randomizedQueue = new RandomizedQueue<Integer>();
//      StdOut.println("size = " + randomizedQueue.size());
//      StdOut.println("isEmpty = " + randomizedQueue.isEmpty());
//      StdOut.println("==============================================" );
//      for (int i = 0; i < 10; i++) {
//        int a = StdRandom.uniform(1000);
//        StdOut.println("in = " + a);
//        randomizedQueue.enqueue(a);
//        StdOut.println("isEmpty = " + randomizedQueue.isEmpty());
//        StdOut.println("size = " + randomizedQueue.size());
//      }
//      StdOut.println("==============================================" );
//      for (int i = 0; i < 10; i++) {
//        int a = StdRandom.uniform(1000);
//        StdOut.println("in = " + a);
//        StdOut.println("dequeue = " + randomizedQueue.dequeue());
//        StdOut.println("isEmpty = " + randomizedQueue.isEmpty());
//        StdOut.println("size = " + randomizedQueue.size());
//      }
//      StdOut.println("==============================================" );
//      for (int i = 0; i < 10; i++) {
//        int a = StdRandom.uniform(1000);
//        StdOut.println("in = " + a);
//        randomizedQueue.enqueue(a);
//        StdOut.println("isEmpty = " + randomizedQueue.isEmpty());
//        StdOut.println("size = " + randomizedQueue.size());
//      }
//      StdOut.println("==============================================" );
//      for (int i = 0; i < 11; i++) {
//        int a = StdRandom.uniform(1000);
//        StdOut.println("in = " + a);
//        StdOut.println("dequeue = " + randomizedQueue.dequeue());
//        StdOut.println("isEmpty = " + randomizedQueue.isEmpty());
//        StdOut.println("size = " + randomizedQueue.size());
//      }

      for (int i = 0; i < 5000; i++) {
        int a = StdRandom.uniform(100);
        if (a < 80) {
          StdOut.println("enqueue = " + a);
          randomizedQueue.enqueue(a);
          StdOut.println("isEmpty = " + randomizedQueue.isEmpty());
          StdOut.println("size = " + randomizedQueue.size());
          StdOut.println("==============================================" );
        } else if (a < 90) {
          StdOut.println("dequeue = " + randomizedQueue.dequeue());
          StdOut.println("isEmpty = " + randomizedQueue.isEmpty());
          StdOut.println("size = " + randomizedQueue.size());
          StdOut.println("==============================================" );
        } else if (a < 100) {
          StdOut.println("sample = " + randomizedQueue.sample());
          StdOut.println("isEmpty = " + randomizedQueue.isEmpty());
          StdOut.println("size = " + randomizedQueue.size());
          StdOut.println("==============================================" );
        }
      }
    }
}

public class Main {

    public static void main(String[] args) {
      Deque<Integer> deque = new Deque<Integer>();
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
//      int count = 0;
//      for (int i = 0; i < 500; i++) {
//        int a = StdRandom.uniform(100);
//        if (a < 10) {
//          StdOut.println("addFirst = " + a);
//          deque.addFirst(a);
//          count++;
//          StdOut.println("isEmpty = " + deque.isEmpty());
//          StdOut.println("size = " + deque.size());
//          StdOut.println("count = " + count);
//          StdOut.println("==============================================" );
//        } else if (a < 20) {
//          StdOut.println("addLast = " + a);
//          deque.addLast(a);
//          count++;
//          StdOut.println("isEmpty = " + deque.isEmpty());
//          StdOut.println("size = " + deque.size());
//          StdOut.println("count = " + count);
//          StdOut.println("==============================================" );
//        } else if (a < 60) {
//          StdOut.println("removeFirst = " + deque.removeFirst());
//          count--;
//          StdOut.println("isEmpty = " + deque.isEmpty());
//          StdOut.println("size = " + deque.size());
//          StdOut.println("count = " + count);
//          StdOut.println("==============================================" );
//        } else if (a < 100) {
//          StdOut.println("removeLast = " + deque.removeLast());
//          count--;
//          StdOut.println("isEmpty = " + deque.isEmpty());
//          StdOut.println("size = " + deque.size());
//          StdOut.println("count = " + count);
//          StdOut.println("==============================================" );
//        }
//      }

      deque.addLast(15);
      deque.addLast(16);
      deque.removeLast();
      deque.removeFirst();
      deque.removeLast();
    }
}

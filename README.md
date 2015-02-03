# RandomizedQueuesAndDeques
Algorithms, Part I, Week 2

Submission
Submission time	Mon-02-Feb 22:48:46
Raw Score	100.00 / 100.00
Feedback	See the Assessment Guide for information on how to read this report.
Assessment Summary
Compilation:  PASSED
Style:        PASSED
Findbugs:     No potential bugs found.
API:          PASSED

Correctness:  35/35 tests passed
Memory:       51/51 tests passed
Timing:       24/24 tests passed

Aggregate score: 100.00% [Correctness: 65%, Memory: 10%, Timing: 25%, Style: 0%]
Assessment Details
The following files were submitted:
----------------------------------
total 16K
-rw-r--r-- 1 4.0K Feb  3 06:50 Deque.java
-rw-r--r-- 1 2.6K Feb  3 06:50 RandomizedQueue.java
-rw-r--r-- 1  488 Feb  3 06:50 Subset.java
-rw-r--r-- 1 2.5K Feb  3 06:50 studentSubmission.zip


******************************************************************************
*  compiling
******************************************************************************


% javac Deque.java
*-----------------------------------------------------------
================================================================

% javac RandomizedQueue.java
*-----------------------------------------------------------
Note: RandomizedQueue.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
================================================================

% javac Subset.java
*-----------------------------------------------------------
================================================================



% checkstyle *.java
*-----------------------------------------------------------
================================================================


Testing the APIs of your programs.
*-----------------------------------------------------------
Deque:

RandomizedQueue:

Subset:

================================================================


******************************************************************************
*  correctness
******************************************************************************

Testing methods in Deque
*-----------------------------------------------------------
Running 15 total tests.

Tests 1-6 make random calls to addFirst(), addLast(), removeFirst(), and
removeLast(). The probabilities of each operation are p1, p2, p3, and p4,
respectively.

Test 1: Calls to addFirst() and addLast() only
  *     5 random calls (p1 = 0.5, p2 = 0.5, p3 = 0.0, p4 = 0.0)
  *    50 random calls (p1 = 0.5, p2 = 0.5, p3 = 0.0, p4 = 0.0)
  *   500 random calls (p1 = 0.5, p2 = 0.5, p3 = 0.0, p4 = 0.0)
  *  1000 random calls (p1 = 0.5, p2 = 0.5, p3 = 0.0, p4 = 0.0)
==> passed

Test 2: Calls to addFirst() and removeFirst()
  *     5 random calls (p1 = 0.9, p2 = 0.0, p3 = 0.1, p4 = 0.0)
  *    50 random calls (p1 = 0.9, p2 = 0.0, p3 = 0.1, p4 = 0.0)
  *   500 random calls (p1 = 0.9, p2 = 0.0, p3 = 0.1, p4 = 0.0)
  *  1000 random calls (p1 = 0.9, p2 = 0.0, p3 = 0.1, p4 = 0.0)
  *     5 random calls (p1 = 0.1, p2 = 0.0, p3 = 0.9, p4 = 0.0)
  *    50 random calls (p1 = 0.1, p2 = 0.0, p3 = 0.9, p4 = 0.0)
  *   500 random calls (p1 = 0.1, p2 = 0.0, p3 = 0.9, p4 = 0.0)
  *  1000 random calls (p1 = 0.1, p2 = 0.0, p3 = 0.9, p4 = 0.0)
==> passed

Test 3: Calls to addFirst() and removeLast()
  *     5 random calls (p1 = 0.9, p2 = 0.0, p3 = 0.0, p4 = 0.1)
  *    50 random calls (p1 = 0.9, p2 = 0.0, p3 = 0.0, p4 = 0.1)
  *   500 random calls (p1 = 0.9, p2 = 0.0, p3 = 0.0, p4 = 0.1)
  *  1000 random calls (p1 = 0.9, p2 = 0.0, p3 = 0.0, p4 = 0.1)
  *     5 random calls (p1 = 0.1, p2 = 0.0, p3 = 0.0, p4 = 0.9)
  *    50 random calls (p1 = 0.1, p2 = 0.0, p3 = 0.0, p4 = 0.9)
  *   500 random calls (p1 = 0.1, p2 = 0.0, p3 = 0.0, p4 = 0.9)
  *  1000 random calls (p1 = 0.1, p2 = 0.0, p3 = 0.0, p4 = 0.9)
==> passed

Test 4: Calls to addLast() and removeLast()
  *     5 random calls (p1 = 0.0, p2 = 0.9, p3 = 0.0, p4 = 0.1)
  *    50 random calls (p1 = 0.0, p2 = 0.9, p3 = 0.0, p4 = 0.1)
  *   500 random calls (p1 = 0.0, p2 = 0.9, p3 = 0.0, p4 = 0.1)
  *  1000 random calls (p1 = 0.0, p2 = 0.9, p3 = 0.0, p4 = 0.1)
  *     5 random calls (p1 = 0.0, p2 = 0.1, p3 = 0.0, p4 = 0.9)
  *    50 random calls (p1 = 0.0, p2 = 0.1, p3 = 0.0, p4 = 0.9)
  *   500 random calls (p1 = 0.0, p2 = 0.1, p3 = 0.0, p4 = 0.9)
  *  1000 random calls (p1 = 0.0, p2 = 0.1, p3 = 0.0, p4 = 0.9)
==> passed

Test 5: Calls to addLast() and removeFirst()
  *     5 random calls (p1 = 0.0, p2 = 0.9, p3 = 0.1, p4 = 0.0)
  *    50 random calls (p1 = 0.0, p2 = 0.9, p3 = 0.1, p4 = 0.0)
  *   500 random calls (p1 = 0.0, p2 = 0.9, p3 = 0.1, p4 = 0.0)
  *  1000 random calls (p1 = 0.0, p2 = 0.9, p3 = 0.1, p4 = 0.0)
  *     5 random calls (p1 = 0.0, p2 = 0.1, p3 = 0.9, p4 = 0.0)
  *    50 random calls (p1 = 0.0, p2 = 0.1, p3 = 0.9, p4 = 0.0)
  *   500 random calls (p1 = 0.0, p2 = 0.1, p3 = 0.9, p4 = 0.0)
  *  1000 random calls (p1 = 0.0, p2 = 0.1, p3 = 0.9, p4 = 0.0)
==> passed

Test 6: Calls to addFirst(), addLast(), removeFirst(), and removeLast()
  *     5 random calls (p1 = 0.4, p2 = 0.4, p3 = 0.1, p4 = 0.1)
  *    50 random calls (p1 = 0.4, p2 = 0.4, p3 = 0.1, p4 = 0.1)
  *   500 random calls (p1 = 0.4, p2 = 0.4, p3 = 0.1, p4 = 0.1)
  *  1000 random calls (p1 = 0.4, p2 = 0.4, p3 = 0.1, p4 = 0.1)
  *     5 random calls (p1 = 0.1, p2 = 0.1, p3 = 0.4, p4 = 0.4)
  *    50 random calls (p1 = 0.1, p2 = 0.1, p3 = 0.4, p4 = 0.4)
  *   500 random calls (p1 = 0.1, p2 = 0.1, p3 = 0.4, p4 = 0.4)
  *  1000 random calls (p1 = 0.1, p2 = 0.1, p3 = 0.4, p4 = 0.4)
==> passed

Test 7: Removing from an empty deque
  *  removeFirst()
  *  removeLast()
==> passed

Test 8: Create multiple deque objects at the same time
==> passed

Test 9: Check iterator() after calls only to addFirst()
==> passed

Test 10: Check iterator() after intermixed calls to addFirst(), addLast(),
         removeFirst(), and removeLast()
==> passed

Test 11: Create two independent iterators to same deque
==> passed

Test 12: Create Deque objects of different parameterized types
==> passed

Test 13: Check that addFirst() and addLast() each throw a NullPointerException
         when inserting null items
==> passed

Test 14: Check that remove() and next() throw the specified exceptions in iterator()
==> passed

Test 15: Check iterator() when Deque is empty
==> passed


Total: 15/15 tests passed!

================================================================

Testing methods in RandomizedQueue
*-----------------------------------------------------------
Running 17 total tests.

Tests 1-4 make random calls to enqueue(), dequeue(), and sample().
The probabilities of each operation are p1, p2, and p3, respectively.

Test 1: Calls to enqueue() (and dequeue() just to verify)
  *     5 random calls (p1 = 1.0, p2 = 0.0, p3 = 0.0)
  *    50 random calls (p1 = 1.0, p2 = 0.0, p3 = 0.0)
  *   500 random calls (p1 = 1.0, p2 = 0.0, p3 = 0.0)
  *  1000 random calls (p1 = 1.0, p2 = 0.0, p3 = 0.0)
==> passed

Test 2: Calls to enqueue() and dequeue()
  *     5 random calls (p1 = 0.9, p2 = 0.1, p3 = 0.0)
  *    50 random calls (p1 = 0.9, p2 = 0.1, p3 = 0.0)
  *   500 random calls (p1 = 0.9, p2 = 0.1, p3 = 0.0)
  *  1000 random calls (p1 = 0.9, p2 = 0.1, p3 = 0.0)
  *     5 random calls (p1 = 0.1, p2 = 0.9, p3 = 0.0)
  *    50 random calls (p1 = 0.1, p2 = 0.9, p3 = 0.0)
  *   500 random calls (p1 = 0.1, p2 = 0.9, p3 = 0.0)
  *  1000 random calls (p1 = 0.1, p2 = 0.9, p3 = 0.0)
==> passed

Test 3: Calls to enqueue() and sample()
  *     5 random calls (p1 = 0.9, p2 = 0.0, p3 = 0.1)
  *    50 random calls (p1 = 0.9, p2 = 0.0, p3 = 0.1)
  *   500 random calls (p1 = 0.9, p2 = 0.0, p3 = 0.1)
  *  1000 random calls (p1 = 0.9, p2 = 0.0, p3 = 0.1)
  *     5 random calls (p1 = 0.1, p2 = 0.0, p3 = 0.9)
  *    50 random calls (p1 = 0.1, p2 = 0.0, p3 = 0.9)
  *   500 random calls (p1 = 0.1, p2 = 0.0, p3 = 0.9)
  *  1000 random calls (p1 = 0.1, p2 = 0.0, p3 = 0.9)
==> passed

Test 4: Calls to enqueue(), dequeue(), and sample()
  *     5 random calls (p1 = 0.8, p2 = 0.1, p3 = 0.1)
  *    50 random calls (p1 = 0.8, p2 = 0.1, p3 = 0.1)
  *   500 random calls (p1 = 0.8, p2 = 0.1, p3 = 0.1)
  *  1000 random calls (p1 = 0.8, p2 = 0.1, p3 = 0.1)
  *     5 random calls (p1 = 0.1, p2 = 0.1, p3 = 0.8)
  *    50 random calls (p1 = 0.1, p2 = 0.1, p3 = 0.8)
  *   500 random calls (p1 = 0.1, p2 = 0.1, p3 = 0.8)
  *  1000 random calls (p1 = 0.1, p2 = 0.1, p3 = 0.8)
==> passed

Test 5: dequeue() and sample() from an empty randomized queue
  *  dequeue()
  *  sample()
==> passed

Test 6: Create multiple randomized queue objects at the same time
==> passed

Test 7: Check that iterator() returns correct items after a sequence of
         enqueue() operations
==> passed

Test 8: Check that iterator() returns correct items after sequence of enqueue()
        and dequeue() operations
==> passed

Test 9: Create two independent iterators to same randomized queue
  *  N = 10
  *  N = 1000
==> passed

Test 10: Create two iterators to different randomized queues
==> passed

Test 11: Create RandomizedQueue objects of different parameterized types
==> passed

Test 12: Check randomness of sample() by enqueueing strings, repeatedly calling
         sample(), and counting the frequency of each value.
  *  Enqueue strings A to C and sampling 3000 times
  *  Enqueue strings A to E and sampling 5000 times
  *  Enqueue strings A to H and sampling 8000 times
  *  Enqueue strings A to J and sampling 10000 times
==> passed

Test 13: Check randomness of dequeue() by enqueueing strings, repeatedly calling
         dequeue() until a specific enqueued string appears.
  *  Enqueue strings A to C and call dequeue() until C is dequeued; repeat 3000 times
  *  Enqueue strings A to E and call dequeue() until B is dequeued; repeat 5000 times
  *  Enqueue strings A to H and call dequeue() until E is dequeued; repeat 8000 times
  *  Enqueue strings A to J and call dequeue() until F is dequeued; repeat 10000 times
==> passed

Test 14: Check randomness of iterator() by enqueueing strings, getting an iterator()
         and repeatedly calling next() until a specific enqueued string appears.
  *  Enqueue strings A to C, create iterator(), and call next() until B is returned;
     Repeat 3000 times
  *  Enqueue strings A to E, create iterator(), and call next() until D is returned;
     Repeat 5000 times
  *  Enqueue strings A to H, create iterator(), and call next() until A is returned;
     Repeat 8000 times
  *  Enqueue strings A to J, create iterator(), and call next() until E is returned;
     Repeat 10000 times
==> passed

Test 15: Check that NullPointerException is thrown when inserting null items
==> passed

Test 16: Check that remove() and next() throw the specified exceptions in iterator()
==> passed

Test 17: Check iterator() when RandomizedQueue is empty
==> passed


Total: 17/17 tests passed!

================================================================

Testing methods in Subset
*-----------------------------------------------------------
Running 3 total tests.

Test 1: assignment inputs

% echo "A B C D E F G H I" | java Subset 3
[student solution]
B
H
E

% echo "A B C D E F G H I" | java Subset 3
[student solution]
C
D
B

% echo "AA BB BB BB BB BB CC CC " | java Subset 8
[student solution]
AA
BB
BB
BB
BB
CC
CC
BB

==> passed

Test 2: various inputs

% echo "A B C D E F G H I" | java Subset 1
[student solution]
I

% echo "A B C D E F G H I" | java Subset 5
[student solution]
B
F
D
H
I

% echo "A B C D E F G H I" | java Subset 5
[student solution]
I
B
H
G
D

% echo "A B C D E F G H I" | java Subset 9
[student solution]
C
B
G
H
I
D
E
A
F

% echo "A B C D E F G H I" | java Subset 0
[student solution]

% echo "it was the best of times it was the worst of times" | java Subset 10
[student solution]
times
it
times
was
the
best
of
it
the
worst

% echo "It was the best of times, it was the worst of times, it was ..." | java Subset 10
[student solution]
do
the
and
and
to
was
was
close
get
inquisitively.

% echo "AA BB BB BB BB BB CC CC " | java Subset 7
[student solution]
AA
BB
BB
BB
BB
CC
CC

==> passed

Test 3: check that subsets are uniformly random
  * 1000 subsets of size 1 from subset10.txt
  * 250 subsets of size 4 from subset10.txt
  * 600 subsets of size 1 from subset6.txt
  * 300 subsets of size 2 from subset6.txt
  * 800 subsets of size 1 from subset8.txt
  * 160 subsets of size 5 from subset8.txt
==> passed

Total: 3/3 tests passed!

================================================================

******************************************************************************
*  memory
******************************************************************************

Computing memory of Deque
*-----------------------------------------------------------
Running 27 total tests.

Test 1a-1e: Total memory usage after inserting N items.

                 N        bytes
----------------------------------------------------------
=> passed        8          424         
=> passed       64         3112         
=> passed      256        12328         
=> passed     1024        49192         
=> passed     4096       196648         
==> 5/5 tests passed

Memory: 48.00 N + 40.00  (R^2 = 1.000)



Test 2a-2e: Total memory usage after inserting N+1 items.

                 N        bytes
----------------------------------------------------------
=> passed        8          472         
=> passed       64         3160         
=> passed      256        12376         
=> passed     1024        49240         
=> passed     4096       196696         
==> 5/5 tests passed

Memory after adding N = 2^i + 1 items: 48.00 N + 40.00  (R^2 = 1.000)



Test 3a-3e: Total memory usage after inserting 2N+1 items,
            and then deleting N items.

                 N        bytes
----------------------------------------------------------
=> passed        8          472         
=> passed       64         3160         
=> passed      256        12376         
=> passed     1024        49240         
=> passed     4096       196696         
==> 5/5 tests passed

Memory: 48.00 N + 40.00  (R^2 = 1.000)



Test 4a-4e: Total memory usage after inserting N items,
            and then deleting all but one item.
            (should not grow with N or be too large of a constant)

                 N        bytes
----------------------------------------------------------
=> passed        8           88         
=> passed       64           88         
=> passed      256           88         
=> passed     1024           88         
=> passed     4096           88         
==> 5/5 tests passed

Memory after adding N = 2^i items: 88.00  (R^2 = 1.000)



Test 5a-5e: Total memory usage of iterator after inserting N items.
            (should not grow with N or be too large of a constant)

                 N        bytes
----------------------------------------------------------
=> passed        8           32         
=> passed       64           32         
=> passed      256           32         
=> passed     1024           32         
=> passed     4096           32         
==> 5/5 tests passed

Memory of iterator after adding N = 2^i items: 32.00  (R^2 = 1.000)



Test 6: check for loitering by adding 100 strings and deleting them.
==> passed

Test 7: Worst-case constant memory allocated or deallocated
        per deque operation?
  *  T = 128 random operations
  *  T = 256 random operations
  *  T = 512 random operations
==> passed

Total: 27/27 tests passed!

================================================================



Computing memory of RandomizedQueue
*-----------------------------------------------------------
Running 22 total tests.

Test 1a-1d: Total memory usage after inserting N integers.

                 N        bytes
----------------------------------------------------------
=> passed       64          640         
=> passed      256         2176         
=> passed     1024         8320         
=> passed     4096        32896         
==> 4/4 tests passed


Memory: 8.00 N + 128.00  (R^2 = 1.000)



Test 2a-2d: Total memory usage after inserting N+1 items.

                 N        bytes
----------------------------------------------------------
=> passed       64         1152         
=> passed      256         4224         
=> passed     1024        16512         
=> passed     4096        65664         
==> 4/4 tests passed


Memory: 16.00 N + 112.00  (R^2 = 1.000)



Test 3a-3d: Total memory usage after inserting 2N+1 items, and
            then deleting N items.

                 N        bytes
----------------------------------------------------------
=> passed       64         2176         
=> passed      256         8320         
=> passed     1024        32896         
=> passed     4096       131200         
==> 4/4 tests passed


Memory: 32.00 N + 96.00  (R^2 = 1.000)



Test 4a-4d: Total memory usage after inserting N items, and
            then deleting all but one item.

                 N        bytes
----------------------------------------------------------
=> passed       64          144         
=> passed      256          144         
=> passed     1024          144         
=> passed     4096          144         
==> 4/4 tests passed


Memory: 144.00  (R^2 = 1.000)



Test 5a-5d: Total memory usage of iterator after inserting N items.

                 N        bytes
----------------------------------------------------------
=> passed       64          576         
=> passed      256         2112         
=> passed     1024         8256         
=> passed     4096        32832         
==> 4/4 tests passed


Memory: 8.00 N + 64.00  (R^2 = 1.000)



Test 6: Checking for loitering by adding 100 strings and deleting them.
==> passed

Test 7: Insert T items into queue; then iterate over queue and check that
worst-case constant memory is allocated or deallocated per
iterator operation?
  *  T = 64
  *  T = 128
  *  T = 256
==> passed

Total: 22/22 tests passed!

================================================================



******************************************************************************
*  memory
******************************************************************************

Computing memory of Subset
*-----------------------------------------------------------
Running 2 total tests.

Test 1: Check that only one Deque or RandomizedQueue object is created
  * filename = subset9.txt, N = 9, k = 1
  * filename = subset9.txt, N = 9, k = 2
  * filename = subset9.txt, N = 9, k = 4
  * filename = tinyTale.txt, N = 12, k = 10
  * filename = tale.txt, N = 138653, k = 50
==> passed

Test 2: Check that the maximum size of any Deque or RandomizedQueue object
        created is <= N
  * filename = subset9.txt, N = 9, k = 1
  * filename = subset9.txt, N = 9, k = 2
  * filename = subset9.txt, N = 9, k = 4
  * filename = tinyTale.txt, N = 12, k = 10
  * filename = tale.txt, N = 138653, k = 5
  * filename = tale.txt, N = 138653, k = 50
  * filename = tale.txt, N = 138653, k = 500
  * filename = tale.txt, N = 138653, k = 5000
  * filename = tale.txt, N = 138653, k = 50000
==> passed

Test 3 (bonus): Check that maximum size of any or Deque or RandomizedQueue object
                created is <= k
  * filename = tale.txt, N = 138653, k = 5
    - max size of RandomizedQueue object = 138653
  * filename = tale.txt, N = 138653, k = 50
    - max size of RandomizedQueue object = 138653
  * filename = tale.txt, N = 138653, k = 500
    - max size of RandomizedQueue object = 138653
  * filename = tale.txt, N = 138653, k = 5000
    - max size of RandomizedQueue object = 138653
  * filename = tale.txt, N = 138653, k = 50000
    - max size of RandomizedQueue object = 138653
==> FAILED

Total: 2/2 tests passed!

================================================================



******************************************************************************
*  timing
******************************************************************************

Timing Deque
*-----------------------------------------------------------
Running 12 total tests.

N random calls to: addFirst(), addLast(), removeFirst(), and removeLast()

                    N  seconds
------------------------------
=> passed        1024     0.00
=> passed        4096     0.01
=> passed       16384     0.01
=> passed      128000     0.06
=> passed      256000     0.12
=> passed     1024000     0.55
==> 6/6 tests passed


N random calls to next() and hasNext() in iterator()

                    N  seconds
------------------------------
=> passed        1024     0.00
=> passed        4096     0.02
=> passed       16384     0.01
=> passed      128000     0.00
=> passed      256000     0.03
=> passed     1024000     0.44
==> 6/6 tests passed

Total: 12/12 tests passed!
================================================================



Timing RandomizedQueue
*-----------------------------------------------------------
Running 12 total tests.

N random calls to: enqueue(), sample(), dequeue(), isEmpty(), and size()

                    N  seconds
----------------------------------
=> passed        1024     0.00
=> passed        4096     0.01
=> passed       16384     0.01
=> passed      128000     0.02
=> passed      256000     0.06
=> passed     1024000     0.37
==> 6/6 tests passed


N random calls to: next() and hasNext() from iterator()

                    N  seconds
----------------------------------
=> passed        1024     0.00
=> passed        4096     0.00
=> passed       16384     0.01
=> passed      128000     0.01
=> passed      256000     0.01
=> passed     1024000     0.13
==> 6/6 tests passed

Total: 12/12 tests passed!
================================================================

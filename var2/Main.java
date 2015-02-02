import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static Dequeue<String> dequeue = new Dequeue<String>();
    private static RandomizedQueue<String> randomizedQueue = new RandomizedQueue<String>();
    private static BufferedReader reader;

    private static void printCommands() {
        System.out.println("-1 - exit");
        System.out.println("0 - isEmpty()");
        System.out.println("1 - size()");
        System.out.println("2 - addFirst()");
        System.out.println("3 - addLast()");
        System.out.println("4 - removeFirst()");
        System.out.println("5 - removeLast()");
        System.out.println("6 - print with iterator");
    }

    private static void actionD(int command) {
        switch (command) {
            case 0:
                System.out.println(dequeue.isEmpty());
                break;
            case 1:
                System.out.println(dequeue.size());
                break;
            case 2:
                System.out.println("Введите элемент: ");
                try {
                    String input = reader.readLine();
                    dequeue.addFirst(input);
                } catch (IOException e) {
                    System.out.println("Ошибка ввода "+e);
                }
                break;
            case 3:
                System.out.println("Введите элемент: ");
                try {
                    String input = reader.readLine();
                    dequeue.addLast(input);
                } catch (IOException e) {
                    System.out.println("Ошибка ввода "+e);
                }
                break;
            case 4:
                System.out.println(dequeue.removeFirst());
                break;
            case 5:
                System.out.println(dequeue.removeLast());
                break;
            case 6:
                System.out.println();
                for (String item : dequeue) {
                    System.out.print(item);
                }
                System.out.println();
                break;
        }
    }

    private static void printCommandsRQ() {
        System.out.println("-1 - exit");
        System.out.println("0 - isEmpty()");
        System.out.println("1 - size()");
        System.out.println("2 - enqueue()");
        System.out.println("3 - dequeue()");
        System.out.println("4 - sample()");
        System.out.println("5 - print with iterator");
    }

    private static void actionRQ(int command) {
        switch (command) {
            case 0:
                System.out.println(randomizedQueue.isEmpty());
                break;
            case 1:
                System.out.println(randomizedQueue.size());
                break;
            case 2:
                System.out.println("Введите элемент: ");
                try {
                    String input = reader.readLine();
                    randomizedQueue.enqueue(input);
                } catch (IOException e) {
                    System.out.println("Ошибка ввода "+e);
                }
                break;
            case 3:
                System.out.println(randomizedQueue.dequeue());
                break;
            case 4:
                System.out.println(randomizedQueue.sample());
                break;
            case 5:
                System.out.println();
                for (String item : randomizedQueue) {
                    System.out.print(item);
                }
                System.out.println();
                break;
        }
    }


    public static void main(String[] args) {
        reader = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = false;
        while (!exit) {
            System.out.println("Введите команду: ");
            printCommandsRQ();
            try {
                int command = Integer.valueOf(reader.readLine());
                if (command!=-1) {
                    actionRQ(command);
                } else {
                    exit = true;
                }
            } catch (IOException e) {
                System.out.println("Ошибка ввода "+e);
            } catch (IllegalArgumentException e) {
                System.out.println("Введены некорректные данные "+e);
            }

        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kutepoval on 10.07.2014.
 */
public class Subset {
    public static void main(String[] args) {
        int count = Integer.valueOf(args[0]);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String item = null;
        RandomizedQueue<String> randomizedQueue = new RandomizedQueue<String>();
        do {
            try {
                item = reader.readLine();
            } catch (IOException e) {
                System.out.println("Ошибка ввода");
            }
            if (!item.isEmpty()) {
                randomizedQueue.enqueue(item);
            }
        } while (!item.isEmpty());

        for (int i = 0; i<count; i++) {
            System.out.println(randomizedQueue.dequeue());
        }
    }
}

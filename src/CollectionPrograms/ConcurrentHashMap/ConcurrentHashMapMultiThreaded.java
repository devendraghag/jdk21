package CollectionPrograms.ConcurrentHashMap;

import java.util.concurrent.*;

public class ConcurrentHashMapMultiThreaded {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> counters = new ConcurrentHashMap<>();
        counters.put("Thread1", 0);
        counters.put("Thread2", 0);

        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) {
                counters.compute("Thread1", (key, value) -> value + 1);
            }
        };

        Thread thread1 = new Thread(incrementTask);
        Thread thread2 = new Thread(incrementTask);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Counters: " + counters);
    }
}

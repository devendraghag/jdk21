package FunctionalInterface;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Running in a thread!");
        Thread thread = new Thread(task);
        thread.start();
    }
}

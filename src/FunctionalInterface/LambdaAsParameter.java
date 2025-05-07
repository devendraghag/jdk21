package FunctionalInterface;

@FunctionalInterface
interface Printer {
    void print(String msg);
}

public class LambdaAsParameter {
    public static void printMessage(Printer printer) {
        printer.print("Hello from Lambda!");
    }

    public static void main(String[] args) {
        printMessage((msg) -> System.out.println(msg));
    }
}

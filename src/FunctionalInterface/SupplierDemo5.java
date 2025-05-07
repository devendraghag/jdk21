package FunctionalInterface;

import java.util.function.Supplier;

public class SupplierDemo5 {
    public static void main(String args[]) {
        printMessage(() -> "Hello World...");
    }

    public static void printMessage(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }
}

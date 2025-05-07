package FunctionalInterface;

import java.util.function.Supplier;

public class SupplierDemo3 {
    public static void main(String args[]) {
        Supplier<String> supplier = () -> "Hello World...";
        System.out.println(supplier.get());
    }
}

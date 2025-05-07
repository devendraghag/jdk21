package FunctionalInterface;

import java.util.function.Supplier;

public class SupplierDemo2 {
    public static void main(String args[]) {
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Hello World...";
            }
        };
        System.out.println(supplier.get());
    }
}

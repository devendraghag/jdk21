package FunctionalInterface;

import java.util.function.Supplier;

public class SupplierDemo4 {
    public static void main(String args[]) {
        Supplier<String> supplier = SupplierDemo4::getMessage;
        System.out.println(supplier.get());
    }

    public static String getMessage() {
        return "Hello World...";
    }
}

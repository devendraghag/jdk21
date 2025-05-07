package FunctionalInterface;

import java.util.function.Supplier;

public class SupplierDemo1 implements Supplier<String> {
    @Override
    public String get() {
        return "Hello World...";
    }

    public static void main(String args[]){
        SupplierDemo1 supplier = new SupplierDemo1();
        System.out.println(supplier.get());
    }
}

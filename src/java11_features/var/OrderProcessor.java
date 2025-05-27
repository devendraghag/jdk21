package java11_features.var;

import java.util.List;

public class OrderProcessor {
    public static void main(String[] args) {
        var orders = List.of("Order1", "Order2", "Order3");

        for (var order : orders) {
            System.out.println("Processing " + order);
        }

        for (var i = 0; i < 3; i++) {
            System.out.println("Index: " + i);
        }
    }
}

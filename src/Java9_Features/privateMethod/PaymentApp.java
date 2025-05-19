package Java9_Features.privateMethod;

interface PaymentProcessor {

    default void processPayment(double amount) {
        log("Processing payment of $" + amount);
        System.out.println("Payment of $" + amount + " completed.");
    }

    default void refundPayment(double amount) {
        log("Processing refund of $" + amount);
        System.out.println("Refund of $" + amount + " completed.");
    }

    private void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}

public class PaymentApp implements PaymentProcessor {
    public static void main(String[] args) {
        PaymentApp app = new PaymentApp();
        app.processPayment(150.00);
        app.refundPayment(50.00);
    }
}

package java11_features.var;

public class DeviceManager {
    public static void main(String[] args) {
        var runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running device manager");
            }
        };

        runnable.run();
    }
}

package InstanceofPrograms;

interface VehicleInstanceofExample3 {}

class CarInstanceofExample3 implements VehicleInstanceofExample3 {}

public class TestInstanceofExample3 {
    public static void main(String[] args) {
        VehicleInstanceofExample3 v = new CarInstanceofExample3();

        System.out.println(v instanceof VehicleInstanceofExample3);  // true
        System.out.println(v instanceof CarInstanceofExample3);      // true
    }
}

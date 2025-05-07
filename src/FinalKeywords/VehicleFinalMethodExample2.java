package FinalKeywords;

class VehicleFinalMethodExample2 {
    final void run() {
        System.out.println("Vehicle is running");
    }
}

class CarFinalMethodExample2 extends VehicleFinalMethodExample2 {
    // void run() { System.out.println("Car is running"); } // ❌ Error
    void horn() {
        System.out.println("Car horn is working");
    }
    
    public static void main(String[] args) {
        CarFinalMethodExample2 c = new CarFinalMethodExample2();
        c.run();
        c.horn();
    }
}

package InstanceofPrograms;

class AnimalInstanceofExample1 {}

class DogInstanceofExample1 extends AnimalInstanceofExample1 {}

public class TestInstanceofExample1 {
    public static void main(String[] args) {
        DogInstanceofExample1 d = new DogInstanceofExample1();

        System.out.println(d instanceof DogInstanceofExample1);       // true
        System.out.println(d instanceof AnimalInstanceofExample1);    // true (since Dog extends Animal)
    }
}

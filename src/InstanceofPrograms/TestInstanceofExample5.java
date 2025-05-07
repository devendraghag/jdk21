package InstanceofPrograms;

class AnimalInstanceofExample5 {}
class DogInstanceofExample5 extends AnimalInstanceofExample5 {}
class CatInstanceofExample5 extends AnimalInstanceofExample5 {}

public class TestInstanceofExample5 {
    static void checkAnimalType(AnimalInstanceofExample5 a) {
        if (a instanceof DogInstanceofExample5) {
            System.out.println("It's a Dog");
        } else if (a instanceof CatInstanceofExample5) {
            System.out.println("It's a Cat");
        } else {
            System.out.println("Unknown Animal");
        }
    }

    public static void main(String[] args) {
        checkAnimalType(new DogInstanceofExample5());
        checkAnimalType(new CatInstanceofExample5());
        checkAnimalType(new AnimalInstanceofExample5());
    }
}

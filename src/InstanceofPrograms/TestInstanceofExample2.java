package InstanceofPrograms;

class AnimalInstanceofExample2 {}

class CatInstanceofExample2 extends AnimalInstanceofExample2 {
    void meow() {
        System.out.println("Meow!");
    }
}

public class TestInstanceofExample2 {
    public static void main(String[] args) {
        AnimalInstanceofExample2 a = new CatInstanceofExample2();

        if (a instanceof CatInstanceofExample2) {
            CatInstanceofExample2 c = (CatInstanceofExample2) a;  // safe cast
            c.meow();
        }
    }
}

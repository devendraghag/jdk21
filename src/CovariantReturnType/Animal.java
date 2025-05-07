package CovariantReturnType;

//class Animal {
//    public Animal getInstance() {
//        return new Animal();
//    }
//}
//
//class Dog extends Animal {
//    public Animal getInstance() {
//        return new Dog(); // Valid but same return type (Animal)
//    }
//}
//==============================================================================================================================================

class Animal {
    public Animal getInstance() {
        return new Animal();
    }
}

class Dog extends Animal {
    public Dog getInstance() {  // Covariant return type: Dog is a subclass of Animal
        return new Dog();
    }
}

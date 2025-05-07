package Clonning;

class Person implements Cloneable {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void display() {
        System.out.println(name + ", " + age);
    }
}

public class ShallowClonning  {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("John", 30);
        Person p2 = (Person) p1.clone();  // Cloning

        p1.display(); // John, 30
        p2.display(); // John, 30
    }
}
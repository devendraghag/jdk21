package Clonning;

class Address1 implements Cloneable {
    String city;

    Address1(String city) {
        this.city = city;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Clones the Address object
    }
}

class Person1 implements Cloneable {
    String name;
    Address1 address;

    Person1(String name, Address1 address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // First perform a shallow clone, then perform a deep clone for the address
        Person1 cloned = (Person1) super.clone();
        cloned.address = (Address1) address.clone(); // Deep clone of the address
        return cloned;
    }
}

public class DeepCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address1 addr = new Address1("New York");
        Person1 p1 = new Person1("John", addr);
        Person1 p2 = (Person1) p1.clone(); // Now works since clone() is public

        p2.name = "Mike";
        p2.address.city = "Los Angeles"; // Only p2's city changes

        System.out.println(p1.address.city); // Output: New York
        System.out.println(p2.address.city); // Output: Los Angeles
    }
}

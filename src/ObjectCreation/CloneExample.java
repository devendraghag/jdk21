package ObjectCreation;

class CloneExample implements Cloneable {
    String message = "Object created using Cloning";

    void display() {
        System.out.println(message);
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneExample obj1 = new CloneExample();
        CloneExample obj2 = (CloneExample) obj1.clone();
        obj2.display();
    }
}

package ThisPrograms;

class ConstructorChainingExample3 {
    int id;
    String name;

    ConstructorChainingExample3() {
        this(0, "Unknown");
    }

    ConstructorChainingExample3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void printInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        ConstructorChainingExample3 obj = new ConstructorChainingExample3();
        obj.printInfo();
    }
}

package ThisPrograms;

class StudentExample1 {
    int id;
    String name;

    StudentExample1(int id, String name) {
        this.id = id;       // this.id refers to instance variable
        this.name = name;   // name refers to parameter, this.name to instance variable
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        StudentExample1 s = new StudentExample1(101, "Alice");
        s.display();
    }
}

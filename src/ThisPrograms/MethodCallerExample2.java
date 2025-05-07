package ThisPrograms;

class MethodCallerExample2 {
    void show() {
        System.out.println("Inside show()");
    }

    void display() {
        this.show();  // same as calling show()
    }

    public static void main(String[] args) {
        MethodCallerExample2 obj = new MethodCallerExample2();
        obj.display();
    }
}

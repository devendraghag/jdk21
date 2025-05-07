package ThisPrograms;

class PassThisExample4 {
    void display(PassThisExample4 obj) {
        System.out.println("Method called using this reference");
    }

    void show() {
        display(this);  // passing current object
    }

    public static void main(String[] args) {
        PassThisExample4 obj = new PassThisExample4();
        obj.show();
    }
}

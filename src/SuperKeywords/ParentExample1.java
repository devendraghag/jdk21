package SuperKeywords;

class ParentExample1 {
    int num = 100;
}

class ChildAccessVariableExample1 extends ParentExample1 {
    int num = 200;

    void display() {
        System.out.println("Child num: " + num);
        System.out.println("Parent num: " + super.num);
    }

    public static void main(String[] args) {
        ChildAccessVariableExample1 obj = new ChildAccessVariableExample1();
        obj.display();
    }
}

package ThisPrograms;

class ReturnThisExample5 {
    int value = 0;

    ReturnThisExample5 setValue(int value) {
        this.value = value;
        return this;
    }

    ReturnThisExample5 increment() {
        this.value++;
        return this;
    }

    void printValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        ReturnThisExample5 obj = new ReturnThisExample5();
        obj.setValue(5).increment().printValue();  // Method chaining
    }
}

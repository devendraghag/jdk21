package LambdaPrograms;

//Anonymous class
interface Transaction1 {
    public void withDrawAmount(int amt);  // Updated method name
}

public class LambdaExpressionMain {       // Updated class name
    public static void main(String[] args) {
        Transaction1 transactionImpl = new Transaction1() { // Updated variable name
            @Override
            public void withDrawAmount(int amt) {
                System.out.print("Amount withdraw " + amt);
            }
        };
        transactionImpl.withDrawAmount(1111);
    }
}

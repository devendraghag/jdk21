package LambdaPrograms;

@FunctionalInterface
interface Transaction2 { 
    void withDrawAmount(int amt);  // Single abstract method
}

public class LambdaExpressionMain1 { 
    public static void main(String[] args) {
        Transaction2 transactionImpl = (amt) -> System.out.println("Amount withdraw " + amt);
        transactionImpl.withDrawAmount(1111);
    }
}

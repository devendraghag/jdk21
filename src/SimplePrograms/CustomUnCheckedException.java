package SimplePrograms;

class InvalidAgeExceptionRuntime extends RuntimeException{
    public InvalidAgeExceptionRuntime(String message){
        super(message);
    }
}
public class CustomUnCheckedException {
    static int age = 20;
    public static void main(String[] args) throws InvalidAgeExceptionRuntime {
        if(age > 18){
            throw new InvalidAgeExceptionRuntime("Below 18 year of age...You are a child...");
        }
        else {
            System.out.println("You are adult....");
        }
    }
}
package SimplePrograms;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class CustomCheckedException {
    static int age = 20;
    public static void main(String[] args) throws InvalidAgeException {
        if(age > 18){
            throw new InvalidAgeException("Below 18 year of age...You are a child...");
        }
        else {
            System.out.println("You are adult....");
        }
    }
}

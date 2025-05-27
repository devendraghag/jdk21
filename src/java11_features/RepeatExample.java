package java11_features;

public class RepeatExample {
    public static void main(String[] args) {
        String star = "*";
        String border = star.repeat(10);
        System.out.println(border);
        System.out.println("* Java 11 *");
        System.out.println(border);
    }
}

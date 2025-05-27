package java11_features;

public class IsBlankExample {
    public static void main(String[] args) {
        String str1 = "   ";
        String str2 = "";
        String str3 = "Hello";

        System.out.println("str1 is blank: " + str1.isBlank()); // true
        System.out.println("str2 is blank: " + str2.isBlank()); // true
        System.out.println("str3 is blank: " + str3.isBlank()); // false
    }
}

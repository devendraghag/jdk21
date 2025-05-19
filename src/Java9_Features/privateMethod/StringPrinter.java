package Java9_Features.privateMethod;

interface StringUtil {

    static void printUpper(String str) {
        printFormatted(str.toUpperCase());
    }

    static void printLower(String str) {
        printFormatted(str.toLowerCase());
    }

    private static void printFormatted(String str) {
        System.out.println("Formatted: " + str);
    }
}

public class StringPrinter {
    public static void main(String[] args) {
        StringUtil.printUpper("Hello World");
        StringUtil.printLower("Hello World");
    }
}

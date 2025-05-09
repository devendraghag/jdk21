package StringClass;

import java.util.Arrays;

public class StringMethodsDemo {
    public static void main(String[] args) {
        // 1. length()
        String str1 = "Hello";
        System.out.println("Length: " + str1.length()); // 5

        // 2. charAt()
        String str2 = "Java";
        System.out.println("charAt(2): " + str2.charAt(2)); // 'v'

        // 3. substring()
        String str3 = "Programming";
        System.out.println("Substring(0,6): " + str3.substring(0, 6)); // "Progra" 6 left element and 0 considered

        // 4. equals() and equalsIgnoreCase()
        System.out.println("\"abc\".equals(\"abc\"): " + "abc".equals("abc")); // true
        System.out.println("\"abc\".equalsIgnoreCase(\"ABC\"): " + "abc".equalsIgnoreCase("ABC")); // true

        // 5. contains()
        System.out.println("\"Java Programming\".contains(\"gram\"): " + "Java Programming".contains("gram")); // true

        // 6. indexOf() and lastIndexOf()
        String str4 = "banana";
        System.out.println("indexOf('a'): " + str4.indexOf('a'));     // 1
        System.out.println("lastIndexOf('a'): " + str4.lastIndexOf('a')); // 5

        // 7. toUpperCase() / toLowerCase()
        System.out.println("\"java\".toUpperCase(): " + "java".toUpperCase()); // "JAVA"
        System.out.println("\"JAVA\".toLowerCase(): " + "JAVA".toLowerCase()); // "java"

        // 8. trim()
        System.out.println("\"  hello  \".trim(): '" + "  hello  ".trim() + "'"); // "hello"

        // 9. replace() and replaceAll()
        System.out.println("\"apple\".replace('p', 'b'): " + "apple".replace('p', 'b')); // "abble"
        System.out.println("\"a1b2c3\".replaceAll(\"\\\\d\", \"\"): " + "a1b2c3".replaceAll("\\d", "")); // "abc"

        // 10. split()
        String[] words = "a,b,c".split(",");
        System.out.println("Split: " + Arrays.toString(words)); // [a, b, c]

        // 11. startsWith() / endsWith()
        System.out.println("\"welcome\".startsWith(\"wel\"): " + "welcome".startsWith("wel")); // true
        System.out.println("\"welcome\".endsWith(\"me\"): " + "welcome".endsWith("me")); // true

        // 12. isEmpty() / isBlank() (Java 11+)
        System.out.println("\"\".isEmpty(): " + "".isEmpty());  // true
        System.out.println("\" \".isBlank(): " + " ".isBlank()); // true

        // 13. join()
        String joined = String.join("-", "A", "B", "C");
        System.out.println("Joined: " + joined); // "A-B-C"

        // 14. valueOf()
        String str5 = String.valueOf(123);
        System.out.println("valueOf(123): " + str5); // "123"
    }
}

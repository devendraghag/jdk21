package StringClass;

public class StringCreationAndComparison {

    public static void main(String[] args) {

        System.out.println("--- Scenario 1: Both Strings created using Literals (SCP) ---");
        String s1 = "hello"; // Created in SCP
        String s2 = "hello"; // Reference to existing "hello" in SCP
        String s3 = "world"; // Created in SCP

        System.out.println("String s1 = \"hello\";");
        System.out.println("String s2 = \"hello\";");
        System.out.println("String s3 = \"world\";");
        System.out.println();

        System.out.println("1.1: s1 == s2 (Comparing references of identical literals)");
        System.out.println("Result: " + (s1 == s2)); // true (Both point to the same object in SCP)
        System.out.println("Reason: String literals with the same content refer to the same object in the String Constant Pool.");
        System.out.println();

        System.out.println("1.2: s1.equals(s2) (Comparing content of identical literals)");
        System.out.println("Result: " + s1.equals(s2)); // true (Content is identical)
        System.out.println("Reason: The content of s1 (\"hello\") is the same as the content of s2 (\"hello\").");
        System.out.println();

        System.out.println("1.3: s1 == s3 (Comparing references of different literals)");
        System.out.println("Result: " + (s1 == s3)); // false (Point to different objects in SCP)
        System.out.println("Reason: s1 refers to \"hello\" and s3 refers to \"world\"; they are distinct objects in the SCP.");
        System.out.println();

        System.out.println("1.4: s1.equals(s3) (Comparing content of different literals)");
        System.out.println("Result: " + s1.equals(s3)); // false (Content is different)
        System.out.println("Reason: The content of s1 (\"hello\") is different from the content of s3 (\"world\").");
        System.out.println();

        System.out.println("--- Scenario 2: Both Strings created using 'new' keyword ---");
        String s4 = new String("java"); // New object in heap
        String s5 = new String("java"); // Another new object in heap
        String s6 = new String("kotlin"); // Another new object in heap

        System.out.println("String s4 = new String(\"java\");");
        System.out.println("String s5 = new String(\"java\");");
        System.out.println("String s6 = new String(\"kotlin\");");
        System.out.println();

        System.out.println("2.1: s4 == s5 (Comparing references of new objects with identical content)");
        System.out.println("Result: " + (s4 == s5)); // false (Two distinct objects in heap)
        System.out.println("Reason: The 'new' keyword always creates a new object in the heap memory, even if content is the same.");
        System.out.println();

        System.out.println("2.2: s4.equals(s5) (Comparing content of new objects with identical content)");
        System.out.println("Result: " + s4.equals(s5)); // true (Content is identical)
        System.out.println("Reason: The content of s4 (\"java\") is the same as the content of s5 (\"java\").");
        System.out.println();

        System.out.println("2.3: s4 == s6 (Comparing references of new objects with different content)");
        System.out.println("Result: " + (s4 == s6)); // false (Distinct objects with distinct content)
        System.out.println("Reason: s4 and s6 are different objects in the heap with different contents.");
        System.out.println();

        System.out.println("2.4: s4.equals(s6) (Comparing content of new objects with different content)");
        System.out.println("Result: " + s4.equals(s6)); // false (Content is different)
        System.out.println("Reason: The content of s4 (\"java\") is different from the content of s6 (\"kotlin\").");
        System.out.println();

        System.out.println("--- Scenario 3: One String from SCP, One String using 'new' keyword ---");
        String s7 = "programming";         // Created in SCP
        String s8 = new String("programming"); // New object in heap
        String s9 = new String("language");   // New object in heap

        System.out.println("String s7 = \"programming\";");
        System.out.println("String s8 = new String(\"programming\");");
        System.out.println("String s9 = new String(\"language\");");
        System.out.println();

        System.out.println("3.1: s7 == s8 (Comparing SCP literal vs new object with identical content)");
        System.out.println("Result: " + (s7 == s8)); // false (s7 is in SCP, s8 is in heap; different objects)
        System.out.println("Reason: s7 refers to the object in the SCP, while s8 refers to a distinct object created in the heap.");
        System.out.println();

        System.out.println("3.2: s7.equals(s8) (Comparing content of SCP literal vs new object with identical content)");
        System.out.println("Result: " + s7.equals(s8)); // true (Content is identical)
        System.out.println("Reason: The content of s7 (\"programming\") is the same as the content of s8 (\"programming\").");
        System.out.println();

        System.out.println("3.3: s7 == s9 (Comparing SCP literal vs new object with different content)");
        System.out.println("Result: " + (s7 == s9)); // false (Distinct objects with distinct content)
        System.out.println("Reason: s7 is in SCP (\"programming\"), s9 is a new object in heap (\"language\").");
        System.out.println();

        System.out.println("3.4: s7.equals(s9) (Comparing content of SCP literal vs new object with different content)");
        System.out.println("Result: " + s7.equals(s9)); // false (Content is different)
        System.out.println("Reason: The content of s7 (\"programming\") is different from the content of s9 (\"language\").");
        System.out.println();

        System.out.println("--- Scenario 4: Using 'intern()' method ---");
        String s10 = new String("interned"); // New object in heap
        String s11 = s10.intern();           // Puts "interned" into SCP if not present, returns SCP reference
        String s12 = "interned";             // Reference to "interned" in SCP (already created by s11 or existing)

        System.out.println("String s10 = new String(\"interned\");");
        System.out.println("String s11 = s10.intern();");
        System.out.println("String s12 = \"interned\";");
        System.out.println();

        System.out.println("4.1: s10 == s11 (Comparing new object vs its interned version)");
        System.out.println("Result: " + (s10 == s11)); // false (s10 is in heap, s11 is in SCP)
        System.out.println("Reason: s10 is the original heap object, while s11 is the reference to the object in the SCP.");
        System.out.println();

        System.out.println("4.2: s10.equals(s11) (Comparing content of new object vs its interned version)");
        System.out.println("Result: " + s10.equals(s11)); // true (Content is identical)
        System.out.println("Reason: The content of s10 (\"interned\") is the same as the content of s11 (\"interned\").");
        System.out.println();

        System.out.println("4.3: s11 == s12 (Comparing interned object vs SCP literal)");
        System.out.println("Result: " + (s11 == s12)); // true (Both refer to the same object in SCP)
        System.out.println("Reason: Both s11 (obtained via intern()) and s12 (a literal) refer to the exact same \"interned\" object in the SCP.");
        System.out.println();

        System.out.println("4.4: s11.equals(s12) (Comparing content of interned object vs SCP literal)");
        System.out.println("Result: " + s11.equals(s12)); // true (Content is identical)
        System.out.println("Reason: The content is the same for both.");
        System.out.println();

        System.out.println("--- Scenario 5: Edge case with concat and intern ---");
        String part1 = "good";
        String part2 = "morning";
        String combinedLiteral = "goodmorning"; // Created in SCP
        String combinedConcatenation = part1 + part2; // Resulting string might be created in heap at runtime

        System.out.println("String part1 = \"good\"; String part2 = \"morning\";");
        System.out.println("String combinedLiteral = \"goodmorning\";");
        System.out.println("String combinedConcatenation = part1 + part2;");
        System.out.println();

        System.out.println("5.1: combinedLiteral == combinedConcatenation (SCP literal vs runtime concatenation)");
        System.out.println("Result: " + (combinedLiteral == combinedConcatenation)); // false (Usually)
        System.out.println("Reason: `combinedLiteral` is a compile-time constant in SCP. `combinedConcatenation` is evaluated at runtime, resulting in a new object in the heap. (Unless JIT optimization makes it a constant, but typically not)");
        System.out.println();

        System.out.println("5.2: combinedLiteral.equals(combinedConcatenation)");
        System.out.println("Result: " + combinedLiteral.equals(combinedConcatenation)); // true (Content is identical)
        System.out.println("Reason: Their contents are the same.");
        System.out.println();

        System.out.println("5.3: combinedLiteral == combinedConcatenation.intern()");
        System.out.println("Result: " + (combinedLiteral == combinedConcatenation.intern())); // true
        System.out.println("Reason: `combinedConcatenation.intern()` will return the reference to the \"goodmorning\" string in the SCP, which is the same object `combinedLiteral` refers to.");
        System.out.println();
    }
}
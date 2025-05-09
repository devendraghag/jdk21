package StringTokenizerExamples;

import java.util.StringTokenizer;

public class CountTokensExample {
    public static void main(String[] args) {
        String str = "Java Python C++ JavaScript";
        StringTokenizer tokenizer = new StringTokenizer(str);
        System.out.println("Number of tokens: " + tokenizer.countTokens());
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}

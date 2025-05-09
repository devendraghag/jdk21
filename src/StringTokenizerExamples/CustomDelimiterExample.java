package StringTokenizerExamples;

import java.util.StringTokenizer;

public class CustomDelimiterExample {
    public static void main(String[] args) {
        String str = "Java,Python,C++,JavaScript";
        StringTokenizer tokenizer = new StringTokenizer(str, ",");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}

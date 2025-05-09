package StringTokenizerExamples;

import java.util.StringTokenizer;

public class ReturnDelimitersExample {
    public static void main(String[] args) {
        String str = "Java is awesome ";
        StringTokenizer tokenizer = new StringTokenizer(str, " ", true);
        while (tokenizer.hasMoreTokens()) {
            System.out.println("Token: " + tokenizer.nextToken());
        }
    }
}

//        str: "Java is awesome" — the input string.
//        " ": the delimiter is a space character.
//        true: this tells StringTokenizer to return the delimiters as tokens, not just use them to split.
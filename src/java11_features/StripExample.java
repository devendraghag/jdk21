package java11_features;

public class StripExample {
    public static void main(String[] args) {
        String messy = "\u2002  Hello Java! \u2002 ";

        System.out.println("Original: [" + messy + "]");
        System.out.println("strip(): [" + messy.strip() + "]");
        System.out.println("stripLeading(): [" + messy.stripLeading() + "]");
        System.out.println("stripTrailing(): [" + messy.stripTrailing() + "]");
    }
}

package java11_features;

public class LinesExample {
    public static void main(String[] args) {
        String multiline = "Java\nPython\r\nC++\rJavaScript";

        multiline.lines().forEach(line -> System.out.println("Language: " + line));
    }
}

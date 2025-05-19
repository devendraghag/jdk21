package Java9_Features.streamAPI_9_Enhacement;

import java.util.stream.Stream;

public class NullSafeStreamer {
    public static void main(String[] args) {
        String value = null;

        long count = Stream.ofNullable(value).count(); // Returns 0 if null

        System.out.println("Elements in Stream: " + count);
    }
}

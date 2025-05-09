package CollectionPrograms.Hashtable;

import java.util.*;

public class HashtableThreadSafety {
    public static void main(String[] args) {
        Hashtable<String, String> userInfo = new Hashtable<>();
        userInfo.put("user1", "password123");
        userInfo.put("user2", "securePass");

        // Thread-safe operation
        synchronized (userInfo) {
            System.out.println("User info: " + userInfo);
        }
    }
}

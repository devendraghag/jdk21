package CollectionsProgram.ConcurrentHashMap;

import java.util.concurrent.*;

public class ConcurrentHashMapPutIfAbsent {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> loginAttempts = new ConcurrentHashMap<>();
        loginAttempts.put("user1", 1);
        
        // Only set value if key is not present
        loginAttempts.putIfAbsent("user1", 5);  // Won't change because "user1" already exists
        loginAttempts.putIfAbsent("user2", 1);  // Will add the key "user2"

        System.out.println("Login Attempts: " + loginAttempts);
    }
}

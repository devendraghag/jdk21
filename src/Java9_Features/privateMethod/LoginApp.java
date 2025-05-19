package Java9_Features.privateMethod;

interface Authenticator {

    default void login(String username, String password) {
        if (isValid(username, password)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Credentials.");
        }
    }

    private boolean isValid(String username, String password) {
        return "admin".equals(username) && "password123".equals(password);
    }
}

public class LoginApp implements Authenticator {
    public static void main(String[] args) {
        LoginApp app = new LoginApp();
        app.login("admin", "password123");
        app.login("user", "wrongpass");
    }
}

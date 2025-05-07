package StaticPrograms;

import static java.lang.Math.*;

public class StaticImport{ 
    public static void main(String[] args) {
        double result = sqrt(25);  // No need to write Math.sqrt(25)
        System.out.println("Square root of 25: " + result); // Output: Square root of 25: 5.0
    }
}

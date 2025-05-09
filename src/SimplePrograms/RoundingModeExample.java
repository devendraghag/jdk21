package SimplePrograms;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundingModeExample {
    public static void main(String[] args) {
        BigDecimal value = new BigDecimal("10.345");

        // Round the value to 2 decimal places using different rounding modes
        BigDecimal roundedUp = value.setScale(2, RoundingMode.UP);
        BigDecimal roundedDown = value.setScale(2, RoundingMode.DOWN);
        BigDecimal halfUp = value.setScale(2, RoundingMode.HALF_UP);
        BigDecimal halfEven = value.setScale(2, RoundingMode.HALF_EVEN);

        System.out.println("Original: " + value);
        System.out.println("Rounded UP: " + roundedUp);      // 10.35
        System.out.println("Rounded DOWN: " + roundedDown);  // 10.34
        System.out.println("Rounded HALF_UP: " + halfUp);    // 10.35
        System.out.println("Rounded HALF_EVEN: " + halfEven); // 10.34
    }
}

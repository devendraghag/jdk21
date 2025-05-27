package java11_features.var;

import java.util.List;

public class RobotAssembler {
    public static void main(String[] args) {
        var model = "RX-78";
        var parts = List.of("Arm", "Leg", "Torso", "Head");

        for (var part : parts) {
            System.out.println("Attaching: " + part);
        }

        var complete = model + " assembled!";
        System.out.println(complete);
    }
}

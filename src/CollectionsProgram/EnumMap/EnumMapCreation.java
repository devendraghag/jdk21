package CollectionsProgram.EnumMap;

import java.util.*;

enum Color { RED, GREEN, BLUE }

public class EnumMapCreation {
    public static void main(String[] args) {
        EnumMap<Color, String> colorDescriptions = new EnumMap<>(Color.class);
        colorDescriptions.put(Color.RED, "Represents danger or warning");
        colorDescriptions.put(Color.GREEN, "Represents safety or go");
        colorDescriptions.put(Color.BLUE, "Represents calm or serenity");

        System.out.println("Color Descriptions: " + colorDescriptions);
    }
}

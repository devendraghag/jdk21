package CollectionPrograms.EnumMap;

import java.util.*;

enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

public class EnumMapAccessValues {
    public static void main(String[] args) {
        EnumMap<Day, String> workHours = new EnumMap<>(Day.class);
        workHours.put(Day.MONDAY, "9 AM - 5 PM");
        workHours.put(Day.SATURDAY, "10 AM - 2 PM");

        // Accessing specific day’s work hours
        System.out.println("Work hours on Monday: " + workHours.get(Day.MONDAY));
    }
}

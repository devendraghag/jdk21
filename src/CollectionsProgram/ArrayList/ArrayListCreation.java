package CollectionsProgram.ArrayList;

import java.util.ArrayList;

public class ArrayListCreation {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("New York");
        cities.add("Tokyo");
        cities.add("Paris");

        System.out.println("Cities: " + cities);
    }
}

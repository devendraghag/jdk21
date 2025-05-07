package CollectionsProgram.EnumMap;

import java.util.*;

enum Currency { USD, EUR, JPY }

public class EnumMapNullHandling {
    public static void main(String[] args) {
        EnumMap<Currency, Double> exchangeRates = new EnumMap<>(Currency.class);
        exchangeRates.put(Currency.USD, 1.0);
        exchangeRates.put(Currency.EUR, 0.85);

        // Handling null when the key doesn't exist
        Double jpyRate = exchangeRates.getOrDefault(Currency.JPY, null);
        System.out.println("JPY Exchange Rate: " + (jpyRate != null ? jpyRate : "Not Available"));
    }
}

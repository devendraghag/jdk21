package Java9_Features.unmodifiableCollection;

import java.util.Set;

public class SetShield {
    public static void main(String[] args) {
        Set<Integer> primes = Set.of(2, 3, 5, 7, 11);
        System.out.println(primes);

        // primes.remove(2); // ❌ Throws UnsupportedOperationException
    }
}

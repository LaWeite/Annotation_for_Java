@FunctionalInterface
public interface TernaryIntPredicate {
    boolean test(int a, int b, int c);
}

static TernaryIntPredicate allValuesAreDifferentPredicate = (a, b, c) -> a != b && a != c && b != c;

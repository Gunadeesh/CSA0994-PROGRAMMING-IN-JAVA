import java.util.HashSet;
import java.util.Set;

public class question3assignment4 {
    public static void main(String[] args) {
        // Create two sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements to the sets
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Perform union and intersection
        Set<Integer> unionSet = union(set1, set2);
        Set<Integer> intersectionSet = intersection(set1, set2);

        // Display the results
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
    }

    // Method to calculate the union of two sets
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    // Method to calculate the intersection of two sets
    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }
}

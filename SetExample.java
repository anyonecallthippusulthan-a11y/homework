import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        // Add elements (including duplicates)
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // duplicate
        set.add(10); // duplicate

        // Display set
        System.out.println("Set: " + set);

        // Check if element exists
        System.out.println("Contains 20? " + set.contains(20));

        // Remove element
        set.remove(30);

        // Iterate
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
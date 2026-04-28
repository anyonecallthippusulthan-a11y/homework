import java.util.*;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        // Add key-value pairs
        map.put(1, "Ram");
        map.put(2, "Sam");
        map.put(3, "John");

        // Retrieve value using key
        System.out.println("ID 2: " + map.get(2));

        // Update value
        map.put(2, "David");

        // Remove key-value pair
        map.remove(3);

        // Display all keys and values
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
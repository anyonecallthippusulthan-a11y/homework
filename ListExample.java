import java.util.*;

public class ListExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        // Add 5 elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Insert element at specific index
        list.add(2, 25); // index 2

        // Remove element by value
        list.remove(Integer.valueOf(40));

        // Update element at given index
        list.set(1, 99);

        // Traverse and print
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
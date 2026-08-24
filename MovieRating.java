import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MovieRating {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Movie Name -> Rating
        Map<String, Double> movies = new HashMap<>();

        while (true) {

            System.out.println("\n===== MOVIE RATING MANAGEMENT =====");
            System.out.println("1. Add Movie");
            System.out.println("2. Search Movie");
            System.out.println("3. Update Rating");
            System.out.println("4. Delete Movie");
            System.out.println("5. Display All Movies");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            // 1. Add Movie
            if (choice == 1) {

                System.out.print("Enter Movie Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Rating: ");
                double rating = sc.nextDouble();

                movies.put(name, rating);

                System.out.println("Movie added successfully!");
            }

            // 2. Search Movie
            else if (choice == 2) {

                System.out.print("Enter Movie Name: ");
                String name = sc.nextLine();

                if (movies.containsKey(name)) {

                    System.out.println("Movie: " + name);
                    System.out.println("Rating: " + movies.get(name));

                } else {

                    System.out.println("Movie not found!");
                }
            }

            // 3. Update Rating
            else if (choice == 3) {

                System.out.print("Enter Movie Name: ");
                String name = sc.nextLine();

                if (movies.containsKey(name)) {

                    System.out.print("Enter New Rating: ");
                    double rating = sc.nextDouble();

                    movies.put(name, rating);

                    System.out.println("Rating updated successfully!");

                } else {

                    System.out.println("Movie not found!");
                }
            }

            // 4. Delete Movie
            else if (choice == 4) {

                System.out.print("Enter Movie Name: ");
                String name = sc.nextLine();

                if (movies.containsKey(name)) {

                    movies.remove(name);

                    System.out.println("Movie deleted successfully!");

                } else {

                    System.out.println("Movie not found!");
                }
            }

            // 5. Display All Movies
            else if (choice == 5) {

                if (movies.isEmpty()) {

                    System.out.println("No movies available!");

                } else {

                    System.out.println("\n--- All Movies ---");

                    for (Map.Entry<String, Double> entry : movies.entrySet()) {

                        System.out.println(
                            "Movie: " + entry.getKey()
                            + " | Rating: " + entry.getValue()
                        );
                    }
                }
            }

            // 6. Exit
            else if (choice == 6) {

                System.out.println("Program ended.");
                break;

            }

            else {

                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
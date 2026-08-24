import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductInventory {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Product Name -> Quantity
        Map<String, Integer> products = new HashMap<>();

        while (true) {

            System.out.println("\n===== PRODUCT INVENTORY =====");
            System.out.println("1. Add Product");
            System.out.println("2. Search Product");
            System.out.println("3. Update Quantity");
            System.out.println("4. Delete Product");
            System.out.println("5. Display All Products");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            // 1. Add Product
            if (choice == 1) {

                System.out.print("Enter Product Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Quantity: ");
                int quantity = sc.nextInt();

                products.put(name, quantity);

                System.out.println("Product added successfully!");

            }

            // 2. Search Product
            else if (choice == 2) {

                System.out.print("Enter Product Name: ");
                String name = sc.nextLine();

                if (products.containsKey(name)) {

                    System.out.println("Product: " + name);
                    System.out.println("Quantity: " + products.get(name));

                } else {

                    System.out.println("Product not found!");

                }

            }

            // 3. Update Quantity
            else if (choice == 3) {

                System.out.print("Enter Product Name: ");
                String name = sc.nextLine();

                if (products.containsKey(name)) {

                    System.out.print("Enter New Quantity: ");
                    int quantity = sc.nextInt();

                    products.put(name, quantity);

                    System.out.println("Quantity updated successfully!");

                } else {

                    System.out.println("Product not found!");

                }

            }

            // 4. Delete Product
            else if (choice == 4) {

                System.out.print("Enter Product Name: ");
                String name = sc.nextLine();

                if (products.containsKey(name)) {

                    products.remove(name);

                    System.out.println("Product deleted successfully!");

                } else {

                    System.out.println("Product not found!");

                }

            }

            // 5. Display All Products
            else if (choice == 5) {

                if (products.isEmpty()) {

                    System.out.println("No products available!");

                } else {

                    System.out.println("\n--- All Products ---");

                    for (Map.Entry<String, Integer> entry : products.entrySet()) {

                        System.out.println(
                            "Product: " + entry.getKey()
                            + " | Quantity: " + entry.getValue()
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
package shoppingcartapp;

import java.util.Scanner;

public class ShoppingCartApp {
      

    public static void main(String[] args) {
        
        

        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Cart");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    cart.addProduct(id, name, price);
                    break;

                case 2:
                    cart.viewCart();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
      }
    
}

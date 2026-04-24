package shoppingcart;

import java.util.Scanner;

public class main {
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create outer class object
        ShoppingCart cart = new ShoppingCart();

        // Input cart owner
        System.out.print("Enter Cart Owner Name: ");
        cart.cartOwnerName = sc.nextLine();

        // Input item details
        System.out.print("Enter Item Name: ");
        String itemName = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Number of Price Updates: ");
        int updates = sc.nextInt();

        // Create inner class object
        ShoppingCart.Item item = cart.new Item(itemName, quantity, updates);

        // Input prices
        item.inputPrices(sc);

        // Display result
        item.displayDetails();

        sc.close();
    }
}
   


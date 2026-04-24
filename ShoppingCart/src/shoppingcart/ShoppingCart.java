/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shoppingcart;

import java.util.Scanner;


class ShoppingCart {

    String cartOwnerName;

    // Inner Class
    class Item {
        String itemName;
        int quantity;
        double[] priceHistory;

        // Constructor
        Item(String itemName, int quantity, int priceUpdates) {
            this.itemName = itemName;
            this.quantity = quantity;
            this.priceHistory = new double[priceUpdates];
        }

        // Method to input price history
        void inputPrices(Scanner sc) {
            System.out.println("Enter Prices:");
            for (int i = 0; i < priceHistory.length; i++) {
                priceHistory[i] = sc.nextDouble();
            }
        }

        // Get latest price (last element)
        double getLatestPrice() {
            return priceHistory[priceHistory.length - 1];
        }

        // Calculate total bill
        double calculateTotal() {
            return getLatestPrice() * quantity;
        }

        // Display details
        void displayDetails() {
            System.out.println("\nCart Owner: " + cartOwnerName);
            System.out.println("Item Name: " + itemName);
            System.out.println("Quantity: " + quantity);

            System.out.print("Price History: ");
            for (double price : priceHistory) {
                System.out.print(price + " ");
            }

            System.out.println("\nLatest Price: " + getLatestPrice());
            System.out.println("Total Bill: " + calculateTotal());
        }
    }
}

 
        // TODO code application logic here
    
    


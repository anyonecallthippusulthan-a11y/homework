package onlinefoodorder;

import java.util.Scanner;

public class foodorder extends foodio {

    Scanner sq = new Scanner(System.in);    double total;


    int item;
    int quantity;
    double total;

    public foodorder(String name) {
        super(name);
    }

    @Override
    public void placeOrder() {

        System.out.println("1. Briyani");
        System.out.println("2. Parota");
        System.out.println("3. Veg Burger");

        System.out.print("Enter your item: ");
        item = sq.nextInt();

        switch (item) {
            case 1:
                System.out.println("You have chosen Briyani");
                System.out.print("How many you want: ");
                quantity = sq.nextInt();
                total = quantity * 150;
                break;

            case 2:
                System.out.println("You have chosen Parota");
                System.out.print("How many you want: ");
                quantity = sq.nextInt();
                total = quantity * 15;
                break;

            case 3:
                System.out.println("You have chosen Veg Burger");
                System.out.print("How many you want: ");
                quantity = sq.nextInt();
                total = quantity * 100;
                break;

            default:
                System.out.println("Invalid choice");
        }
    }

    @Override
    public void viewbill() {
        System.out.println("\n--- BILL ---");
        System.out.println("Customer Name: " + name);

        switch (item) {
            case 1:
                System.out.println("Item: Briyani");
                break;
            case 2:
                System.out.println("Item: Parota");
                break;
            case 3:
                System.out.println("Item: Veg Burger");
                break;
        }

        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: ₹" + total);
    }
}
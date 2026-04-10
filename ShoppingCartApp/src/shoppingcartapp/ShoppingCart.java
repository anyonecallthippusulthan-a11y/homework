package shoppingcartapp;

public class ShoppingCart {
   
    Product head; // head of linked list

    // Add product at end
    public void addProduct(int id, String name, double price) {
        Product newProduct = new Product(id, name, price);

        if (head == null) {
            head = newProduct;
        } else {
            Product temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newProduct;
        }

        System.out.println("Product added successfully!");
    }

    // View all products
    public void viewCart() {
        if (head == null) {
            System.out.println("Cart is empty!");
            return;
        }

        Product temp = head;
        System.out.println("\n--- Cart Items ---");

        while (temp != null) {
            System.out.println("ID: " + temp.productId);
            System.out.println("Name: " + temp.productName);
            System.out.println("Price: ₹" + temp.price);
            System.out.println("----------------------");
            temp = temp.next;
        }
    }
}
    
}

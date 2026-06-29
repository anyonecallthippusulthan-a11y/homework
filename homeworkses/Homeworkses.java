
package homeworkses;


public class Homeworkses {

    
    public static void main(String[] args) {
           // Choose base phone
        Phone phone = new AndroidPhone();

        // Add accessories (Decorator wrapping)
        phone = new ScreenGuard(phone);
        phone = new PhoneCase(phone);
        phone = new WirelessCharger(phone);
        phone = new Earbuds(phone);

        // Output
        System.out.println("Description: " + phone.getDescription());
        System.out.println("Total Price: " + phone.getPrice());
    }
}
    
    

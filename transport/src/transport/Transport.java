package transport;

import java.util.Scanner;

public class Transport {
        

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Transport t = null;
        int ch;

        do {
            System.out.println("\n1.CityBus 2.LuxuryBus 3.Calculate 4.Display 5.Exit");
            ch = sc.nextInt();

            if (ch == 1 || ch == 2)
            {

                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.println("1.Bangalore 2.Coimbatore 3.Madurai 4.Trichy 5.Salem");
                int r = sc.nextInt();

                String city = "";
                double d = 0;

                switch (r) {
                    case 1: city = "Bangalore"; d = 350; break;
                    case 2: city = "Coimbatore"; d = 500; break;
                    case 3: city = "Madurai"; d = 460; break;
                    case 4: city = "Trichy"; d = 330; break;
                    case 5: city = "Salem"; d = 340; break;
                    default: System.out.println("Invalid"); continue;
                }

                if (ch == 1)
                    t = new CityBus(id, name, city, d);
                else
                    t = new LuxuryBus(id, name, city, d);

                System.out.println("Booked");
            }

            else if (ch == 3) {
                if (t != null) {
                    t.calculateFare();
                    System.out.println("Fare Calculated");
                } else {
                    System.out.println("Book first!");
                }
            }

            else if (ch == 4) {
                if (t != null)
                    t.display();
                else
                    System.out.println("No ticket!");
            }

        } while (ch != 5);

        sc.close();
    }
}
}}
         
    
}

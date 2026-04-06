package products;

import java.util.Scanner;

public class Products {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Electronic");
        System.out.println("2.cothing");
        System.out.println("Enter your option ");
        int option=sc.nextInt();
        if (option ==1)
        {
       electronics p1=new electronics();
        p1.prod ("laptop",60000);
                
        p1.elect(10);
        p1.display();
        }
       if(option==2)
       {
        clothing c1=new clothing ();
      
   c1.prod("cotton",450 );
       c1.cloth(12,"dress");
       c1.display();
       }
    }
    
}

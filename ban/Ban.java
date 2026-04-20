package ban;

import java.util.Scanner;

public class Ban {

    public static void main(String[] args) {
        //In the main() method:

//Read principal amount and number of years from the user.
//
//Call the static method and display:
//
//Bank Name
//
//Principal Amount
//
//Years
//
//Interest Amount
           Scanner  sc=new Scanner(System.in);
           System.out.print("enter your cash");
           double cash=sc.nextDouble();
           System.out.print("enter your year ");
           int  year=sc.nextInt();
            Bank b1=new Bank();
            Bank.calculateInterest(cash, year);
            b1.display(cash, year);
           
           
   }
    
}

package ban;
import java.util.Scanner;
public class Bank {
    final static String bankname  ="ABC BANK";
    final static double interestrate = 7.5;
    static void calculateInterest(double principal ,int year)
    {
            Scanner ko=new Scanner(System.in);

        double interest = (principal *interestrate *year)/100;
        
        System.out.println("your interest              :"+interest);
        
    }
    void display(double principal ,int year)
    {
        System.out.println("YOUR BANK                  :"+bankname);
        System.out.println("YOUR INTERNEST RATE        :"+interestrate);
        System.out.println("your principal             :"+ principal);
        System.out.println("your year                  :"+year);
        
        
    }
    
    
        
    

}

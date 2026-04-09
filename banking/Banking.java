package banking;

import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        boolean h=true;
         banks sd=new banks();
        Scanner ne=new Scanner(System.in);
         System.out.print("Enter Account Number: ");
        sd.setAccountNumber(ne.nextInt());
        ne.nextLine(); // clear buffer

        System.out.print("Enter Account Holder Name: ");
        sd.setAccounHolderName(ne.nextLine());

        System.out.print("Enter Initial Balance: ");
       sd.setBalance(ne.nextDouble());

        
        do{
            
           System.out.println("1.deposit");
           System.out.println("2.withdraw");
           System.out.println("3.display account details");
           System.out.println("4.exit");
            System.out.println("chose one");
            int ace=ne.nextInt();
           
            
            if(ace==1)
            {
                System.out.print(" Enter amount to deposit: ");
                double amount=ne.nextDouble();
                sd.deposit(amount);
                
            }
            else if(ace==2)
            {
                  System.out.print(" Enter amount to withdraw: ");
                double amount=ne.nextDouble();
                sd.deposit(amount);
              
            }
            else if(ace==3)
            {
                sd.display();
            }
            else 
            {
                h=false;
            }
           
        
    }
        while(h);

    }

     }
    

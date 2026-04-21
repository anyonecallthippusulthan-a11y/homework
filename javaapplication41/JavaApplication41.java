package javaapplication41;

import java.util.Scanner;
import javaapplication41.InsufficientBalance;

public class JavaApplication41 {
     double deposit =5000;
     double k;
    public static void main(String[] args) throws Exception, InsufficientBalance {  
      JavaApplication41  ns=new  JavaApplication41 (); 
      ns.menu();
 
    }
    void menu() throws Exception, InsufficientBalance
    {  
        boolean res=true;
        do
        {
        Scanner s=new Scanner(System.in);
        System.out.println("1.withdraw");
        System.out.println("2.check account balance");
        System.out.println("3.exit");
        System.out.println("chose the option");
        int o=s.nextInt();
        if(o==1)
        {
            withdraw(deposit);
        }
        else if(o==2)
        {
               checkbalance();
   
        }
        else {
            res=false;
        }
        }while(res);
    }
    void withdraw(double deposit) throws  InsufficientBalance 
    {
        Scanner n=new Scanner(System.in);
        this.deposit=deposit;
        
        System.out.println("enter your amount");
       
       k=n.nextDouble();
 
        if (k > deposit) {
            throw new InsufficientBalance("Insufficient Balance!");
        }
      
      
        else
        {
       deposit-=k;
       System.out.println(deposit);
        }
          
                 
        
      
    }
     void checkbalance()
     {
         System.out.println("your balance"+deposit);
     }
}

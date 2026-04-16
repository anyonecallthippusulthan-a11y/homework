package javaapplication32;

import java.util.Scanner;
import java.util.Stack;

public class JavaApplication32 {

    public static void main(String[] args)
    {
        Shop s=new Shop();
       
        Scanner se=new Scanner(System.in);
                Scanner sc=new Scanner(System.in);
                
                boolean h=true;
                do{
                

        System.out.println("1.add iteam");
        System.out.println("2.undo last iteam");
        System.out.println("3.view last scanner items");
        System.out.println("4. display all items");
        System.out.println("5.exit");
        System.out.println("enter your option");
        int option =se.nextInt();
        
        if(option==1)
        {
            System.out.println("enter your things");
           String ac=sc.nextLine();
           s.push(ac);
        }
        else if(option==2)
        {
            s.pop();
        }
        else if(option==3)
        {
            s.peek();
            
        }
        else if(option==4)
        {
            s.peek();
            
        }
        else
        {
            h=false;
            System.out.println("exit");
        }
                }while(h);
        
        
    }
    
}

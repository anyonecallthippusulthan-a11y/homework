package maths;

import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean t=true; 

        do {
            System.out.println("\n--- Shape Area Calculator ---");
            System.out.println("1. Circle");
            System.out.println("2. Square");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

             

                if(choice==1)
                {
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();

                    circle c = new circle(radius); // direct object
                    c.calculateArea();
                    
        }

                    else if(choice==2)
                    {
                    System.out.print("Enter side: ");
                    double side = sc.nextDouble();

                    square s = new square(side); // direct object
                    s.calculateArea();
                   
                            }

               else if(choice==3)
               {
                    System.out.println("Exiting...");
                    
               }
                 
               else{
                   t=false;
               }

        } 
        
        while (t);

       
    }
}
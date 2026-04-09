package employeemanagementsystem;

import java.util.Scanner;

public class Employeemanagementsystem {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner ni=new Scanner(System.in);
        Scanner l=new Scanner(System.in);
        System.out.println("how many member detial can store");
        int n=l.nextInt();
        
        for(int i=1;i<=n;i++)
        {
       
       employeedetail e1=new employeedetail();
            System.out.println("the"+i+"employee");
       System.out.print("Enter your  Employee ID           :");
       e1.setEmpID(sc.nextLine());
            System.out.println("");
            
         System.out.print("Enter your Empolyee Name         :" );
         e1.setEname(sc.nextLine());
        System.out.print("Enter your Empolyee designation  :");
        String name=sc.nextLine();
        System.out.print("Enter your Employee salaray      :" );
        
        e1.setSalary(ni.nextDouble());
       
        e1.display(name);
        }
           
        }
    
        
    }
        
    
    


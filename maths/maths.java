package maths;

import java.util.Scanner;


public class maths {
    public static void main(String[] args) throws l
    {
     maths k=new maths();
     try{
     k.studentmark();
      }
     catch(Exception y)
             {
                 System.out.println("plse add the mark in under 100 ");
             
             }}
    
    
    
    
    Scanner sc=new Scanner(System.in);
    
    void studentmark() throws l
    {
       System.out.println("enter the tamil mark");
       int tamil=sc.nextInt();
       if (tamil <= 0 || tamil > 100) 
       {
           throw new IllegalArgumentException("Invalid mark");
       }
       System.out.println("enter the English mark");
       int english=sc.nextInt();
        if (english < 0 || english > 100) 
        {
        throw new IllegalArgumentException("Invalid mark");
         }
        System.out.println("enter the maths mark");
       int ma=sc.nextInt();
       if (ma <0 && ma > 100)
            {
              throw new IllegalArgumentException("Invalid mark");
            }
        display(tamil,english,ma);
        }
    
    void display(int tamil ,int english,int ma)
    {
        System.out.println("enter your tamil mark"+tamil);
        System.out.println("enter  your english mark "+english);
        System.out.println("ente your maths mark"+ma);
    }
}

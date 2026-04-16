package javaapplication32;
public class Shop {
  
   
   String iteam[]=new String[4];
   int top=-1;
   void push(String name)
   {
       
       if(top==3)
       {
           System.out.println("you have pushed");
       }
       else 
       {
           top++;
           iteam[top]=name;
           
       }
   }
     void pop()
           {
               if(top==-1)
               {
                   System.out.println("you have not pushed");
               }
               else
               {
                   System.out.println("Remove last scanned item :" +iteam[top]);
                   top--;
               }
           }
           void peek()
{
    for(int i=top;i>=0;i--)
    {
        System.out.println(iteam[i] );
    }
}
           
} 



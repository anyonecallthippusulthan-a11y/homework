package products;

public class clothing extends product{
     double  size;
     String fiber;
     void  cloth(double size,String fiber)
     {
         this.size=size;
         this .fiber=fiber;
         
     }
     void  display ()
     {
         System.out.println("this is size"+size);
          System.out.println("this is fiber"+fiber);
     }
    
}

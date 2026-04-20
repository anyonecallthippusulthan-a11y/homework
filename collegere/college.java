package collegere;

public class college {
     final double registrationFee;
     static String collegename="PSG";
     static  int  totalstudent=0;
     college (double fee)
     {
         this. registrationFee=fee;
           totalstudent++;

      }
     static void displaycollege()
     {
         System.out.println("the college name            :"+collegename);
         System.out.println("the total student           :"+totalstudent);
     }
     void displayfee()
     {
     System.out.println("Student Registration Fee: " + registrationFee);

     }
     
     
}

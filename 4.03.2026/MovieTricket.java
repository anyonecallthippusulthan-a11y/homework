class MovieTricket
{
 public static void main(String[] args)
 {
   int age=101;
   if (age<12)
   { 
    System.out.println("your tricket is $80");
	}
	if((age>12)&&(age<59))
	{
	System.out.println("your tricket is $150");
	}
	if((age>=60)&&(age<=100))
	{
	  System.out.println("your tricket is $100");
	  
	  
	}
	else
	{
		 System.out.println(" unna ku enka edam illa da");
	}
}}
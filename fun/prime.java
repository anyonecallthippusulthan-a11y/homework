import java.util.Scanner;
class prime
{
	public static void main(String[] args)
	{
		Scanner k=new Scanner(System.in);
		System.out.print("Enter the  prime number");
		int pr=k.nextInt();
		prime joy=new prime();
		String a=joy.primenumber(pr);
		System.out.println(a);
	}
	String primenumber(int a)
	{
		if (a<=1)
		{
			return "not a prime number";
		}
	   for(int i=2;i<a;i++)
	   {
		   if(a %i==0)
		   {
			   return " not the prime number ";
		   }
		  
	   }
			    return "a prime number";
	}
}
		   
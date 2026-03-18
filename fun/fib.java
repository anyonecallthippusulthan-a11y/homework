import java.util.Scanner;
class fibnocci
{
	public static void main(String[] args)
	{
		fibnocci j=new fibnocci();
		j.bye();
		
	}
	void bye()
	{
		Scanner k=new Scanner(System.in);
		int a=0;
		int b=1;
		int c;
		int d;
		System.out.print("Enter the number is range :");
		c=k.nextInt();
		System.out.println(a);
	
		System.out.println(b);

		for (int i=0;i<=c;i++)
		{
			
			d=a+b;
			System.out.println(d);
			a=b;
			b=d;
		}
	}
}

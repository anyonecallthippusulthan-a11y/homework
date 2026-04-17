import java.util.*;
class naming
{
	public static void main(String[] args)
	{
		Scanner na=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=na. nextLine();
		StringBuilder s=new StringBuilder(name);
		System.out.println(s.reverse());
	}
}
/*Palindrome Checker

Write a Java program that:

Accepts a string from the user.

Checks whether it is a palindrome.

Print:

"Palindrome" or

"Not Palindrome"


👉 Do NOT use StringBuilder reverse().
👉 Use only String methods.

*/
import java.util.*;
class PalindromeChecker
{
	public static void main(String[] args)
	{

		Scanner n=new Scanner(System.in);
		System.out.println("check your name palindrome");
		System.out.println("Enter your name ");
		String name=n.nextLine();
        for (int i=name.length()-1;i>=0;i--)
		{
			 char s=name.charAt(i);
			 System.out.print(s);
			
            String st = Character.toString(s);
		if(st.equalsto(name))
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		}
	}
}
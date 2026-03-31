import java.util.Scanner;
class Bank
{
	int  initalBalance;
	int deposit;
	int withdraw;
	int balance;
	public static void main(String[] args)
	{
		boolean hi =true;
		for (int i=0;i<5;i++)
		{
		Scanner sc=new Scanner(System.in);
		Bank b=new Bank();
		
        b.initalBalance=4000;
		
		System.out.println("total ammount"+b.initalBalance);
		System.out.print("deposit");
		b.deposit=sc.nextInt();
		System.out.print("withdraw");
		b.withdraw=sc.nextInt();
		b.balance=b.initalBalance+b.deposit-b.withdraw;
           System.out.println(b.balance);
		}
		
	}
}
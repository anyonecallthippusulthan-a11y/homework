import java.util.Scanner;
class letter
{
	public static void main(String[] args)
	{
		Scanner k=new Scanner(System.in);// number
		Scanner l=new Scanner(System.in);//letter
		System.out.print("Enter the row matix     :");
		int row  =k.nextInt();
		System.out.print("Enter the coloum matix  :");
		int coloum = k.nextInt();
		char arr[][]=new char[row][coloum];
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[i].length;j++)
			{	
				                System.out.print("Enter value for index [" + i + "][" + j + "] : ");

				 arr[i][j]= l.next().charAt(0);
			}
		} 
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"");
				
			}
			                System.out.println(" ");

		}
	}
}
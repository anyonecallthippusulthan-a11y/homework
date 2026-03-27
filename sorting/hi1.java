import java.util.Scanner;
class sort
{
	public static void main(String[]args)
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		int arr[]=new int [size];
		for (int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the insert value");
			arr[i]=sc.nextInt();
		}
		 sort sq =new sort();
		 sq.menu(arr);
		 
		
	}
	Scanner s1=new Scanner(System.in);
	void menu(int arr[])
	{
		boolean exit=true;
		do{
		System.out.println("1.bubble sort");
		System.out.println("2.find the largest Element");
		System.out.println("3.display the original array");
		System.out.println("4.Exit");
		System.out.println("Chose the option");
		int option =s1.nextInt();
		if(option==1)
		{
		  sort1(arr);   
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		}
		else if(option==2)
		{
			max (arr);
		}
		else if(option==3)
		{
			display(arr);
		}
		else{
			exit=false;
		}
		}while(exit);
		
	}
	void sort1(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for (int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
				    arr[j+1]=temp;
				}
			}
		}
		
		   
	}
     void max(int arr[])
	 {
		 int max=arr[0];
		 for (int i=0;i<arr.length;i++)
		 {
			 if(arr[i]>max);
			 {
				 max=arr[i];
				
			
			}
			
		 }
		  System.out.println(arr[max]);
	 }
     void display(int arr[])
	 {
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	 }	 
}
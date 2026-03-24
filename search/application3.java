import java.util.Scanner;
class application3
{
	Scanner s1=new Scanner(System.in);
	void menu(int arr[])
	{
		boolean result=true;
	  do
	   {
		System.out.println("1. Insert ");
		System.out.println("2. Display");
		System.out.println("3. Linear ");
		System.out.println("4. Binary ");
		System.out.println("5. Exit   ");
		System.out.print("chose your option  :");
		int option=s1.nextInt();
		if(option==1)
		{
			insert(arr);
		}
		else if(option==2)
		{
			display(arr);
		}
		else if(option==3)
		{
		int hi=linear(arr);
		System.out.println(hi);
		}
		else if(option==4)
		{
			System.out.println(binary(arr));
		}
		else 
		{
			result=false;
		}
	   }
		while(result);
		
		
	}
	void insert(int arr[])
	{
		for (int i=0;i<arr.length;i++)
		{
		System.out.print("Enter the insert number   :");
		arr[i]=s1.nextInt();
		}
	}
	void display(int arr[])
	{
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	int linear(int arr[])
	{
		System.out.print("Enter your :Linear Sreach:target number  :");
		int target=s1.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				return i;
			}
		}
		return -1;
	}
	int binary(int arr[])
	{
		System.out.print("Enter your target number  :");
		int target=s1.nextInt();
		int left=0;
		int right=arr.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			else if(arr[mid]<target)
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
	     return -1; 
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter your array size  :");
		int size=sc.nextInt();
		
		int arr[]=new int [size];
		
		application3 a1=new application3();
		a1.menu(arr);
		
		
	}
}
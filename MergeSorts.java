/*Menu Options
1. Enter Array
2. Sort in Ascending Order (Merge Sort)
3. Sort in Descending Order (Merge Sort)
4. Find Median
5. Display Array
6. Exit
*/  
import java.util.Scanner;
import java.util.Arrays;
class MergeSorts
{
	public static void main(String[] args)
	{ 
	     Scanner s1=new Scanner(System.in);
		 System.out.print("Enter the array size");
		 int size=s1.nextInt();
		 int arr[]=new int [size];
		 MergeSorts ms=new MergeSorts();
          ms.menu(arr);		 
		
	}
	Scanner sc=new Scanner(System.in);
	void menu(int arr[])
	{
		boolean hi1=true;
		do
		{
			
		System.out.println("1.Enter the array");
		System.out.println("2. Sort in Ascending order");
		System.out.println("3. sort in descending order");
		System.out.println("4.Find median ");
		System.out.println("5.display array");
		System.out.println("6.exit");
		System.out.println("Chose your option");
		int option=sc.nextInt();
		if(option==1)
		{
			hi(arr);
		}
		else if(option==2)
		{
			int [] re=ascending(arr);
			for (int i=0;i<arr.length;i++)
			{
				System.out.print("["+re[i]+"]");
			}
				

		}
	
			else if(option==3)
		{
			int []rel=dec(arr);
			for (int i=arr.length-1;i>=0;i--)
			{
				System.out.print("["+rel[i]+"]");
			}
			
		}
		else if(option==5)
		{
			

			
			display(arr);
		}
		else {
			hi1=false;
		}
		}while (hi1);
		
	}
	void hi(int arr1[])
	{
		for (int i=0;i<arr1.length;i++)
		{
		System.out.print("Enter the Array");
		 arr1[i]=sc.nextInt();
		}
	}
	int [] ascending(int arr[])
	{
		if(arr.length==1)
		{
			return arr;
		}
		int mid =arr.length/2;
		int left[]=ascending(Arrays.copyOfRange(arr,0,mid));
		int right[]=ascending(Arrays.copyOfRange(arr,mid,arr.length));
		  
		  return merge (left,right);
	}
	int [] merge(int left[],int right[])
	{
		int i=0;
		int j=0;
		int k=0;
		int mix[] =new int[left.length+right.length];
		while((i<left.length)&&(j<right.length))
		{
			if(left[i]<right[j])
			{
				mix[k]=left[i];
				i++;
				k++;
			}
			else
			{
				mix[k]=right[j];
				j++;
				k++;
			}
		}
		while (i<left.length)
		{
			mix[k]=left[i];
				i++;
				k++;
		}
		while (j<right.length)
		{
			mix[k]=right[j];
				j++;
				k++;
		}
		return mix;	
	}
	int [] dec(int arr[])
	{
		if(arr.length==1)
		{
			return arr;
		}
		int mid =arr.length/2;
		int left[]=ascending(Arrays.copyOfRange(arr,0,mid));
		int right[]=ascending(Arrays.copyOfRange(arr,mid,arr.length));
		  
		  return merg (left,right);
	}
	int [] merg(int left[],int right[])
	{
		int i=0;
		int j=0;
		int k=0;
		int mixe[] =new int[left.length+right.length];
		while((i<left.length)&&(j<right.length))
		{
			if(left[i]<right[j])
			{
				mixe[k]=left[i];
				i++;
				k++;
			}
			else
			{
				mixe[k]=right[j];
				j++;
				k++;
			}
		}
		while (i<left.length)
		{
			mixe[k]=left[i];
				i++;
				k++;
		}
		while (j<right.length)
		{
			mixe[k]=right[j];
				j++;
				k++;
		}
		return mixe;	
	}
	void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("orginal array");
			System.out.print(arr[i]+" ");
		}
	
	}
}
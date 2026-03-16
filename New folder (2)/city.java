import java.util.Scanner;
class city
{
 public static void main(String[]args)
 {
	 Scanner hi=new Scanner(System.in);
	 Scanner bye=new Scanner(System.in);
	 System.out.print("enter your row name");
	 int rname= hi.nextInt();
	 System.out.print("enter your colum name");
	 int  cname= hi.nextInt ();
	 String ar[][]= new String[rname][cname];
	 for (int i=0;i<ar.length;i++)
	 {
		 for(int j=0;j<ar[i].length;j++)
		 {
			 System.out.print("enter you name "+i+j+"value :");
			 ar[i][j]=bye.nextLine();
		 }
	 }
	 for (int i=0;i<ar.length;i++)
	 {
		 for(int j=0;j<ar[i].length;j++)
		 {
		 System.out.print(ar[i][j]+"");
		 }
		 System.out.println("");
	 }
 }
}

			 
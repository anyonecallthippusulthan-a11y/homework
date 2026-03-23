class array
{
	void sum(int ar[])
	{
		
		 ar[0]=100;
		 ar[2]=300;		
		 ar[1]=200;		
		
	}
    public static void main(String[] args)
	{
		
		int arr[]={10,2,3};
		System.out.println (arr[0]);
        System.out.println (arr[1]);
         System.out.println (arr[2]);		
		array a1= new array();
		a1.sum(arr);
		System.out.println (arr[0]);
        System.out.println (arr[1]);
         System.out.println (arr[2]);		
		
		
	}
}
	
		
		
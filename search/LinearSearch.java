class LinearSearch
{
       int  array(int arr[],int index,int key)
	{
		if(index>=arr.length)
		{
			return -1;
		}
		if(arr[index]==key)
		{
			return index;
		}
		return array (arr,index+1,key);
	}
	public static void main(String[] args)
	{
		int arr[]={10,20,30,40,50};
		int key=30;
		LinearSearch ls=new LinearSearch();
		int result= ls.array(arr,0,key);
		System.out.print("Element found at index"+result);
	}
}
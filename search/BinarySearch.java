class BinarySearch
{
	int Search(int array[],int start,int end, int key)
	{
		if(start>end)
		{
			return -1;
		}
		int mid =(start+end)/2;
		if(array[mid]==key)
		{
			return mid;
		}
		if(array[mid]>key)
		{
			return Search(array,start,mid-1,key);
		}
		if(array[mid]<key)
		{
			return Search(array,mid+1,end,key);
		}
		return Search(array,start, end, key);
	}
	public static void main(String[] args)
	{
		int array[]={5,10,15,20,25,30};
		int key=20;
		int start=0;
		int end=array.length-1;
		BinarySearch bs=new BinarySearch();
		int result=bs.Search(array,start,end,key);
		System.out.print("Element found at index"+result);
	}
}
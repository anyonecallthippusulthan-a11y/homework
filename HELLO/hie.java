class hello
{
	void hi(int b)
	{
		System.out.println(b*=10);
	}
	
	
	public static void main(String[] args)
	{
		
		int b=100;
		
		hello h1=new hello();
		h1.hi(b);
	}
}
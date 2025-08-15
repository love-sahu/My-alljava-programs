class Autoboxing 
{
	public static void main(String[] args) 
	{
		int num=1234;
		Integer num2=num;
		
		boolean b=true;
		Boolean c=b;
		
		float f=12.301f;
		Float f2=f;
		
		System.out.println("primitive :"+num+"  non Primitive :"+num2);
			
		System.out.println("primitive :"+b+"  non Primitive :"+c);
		
		
		System.out.println("primitive :"+f+"  non Primitive :"+f2);
	}
}

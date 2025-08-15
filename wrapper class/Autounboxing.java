class Autounboxing 
{
	public static void main(String[] args) 
	{
		int n=123;
		
		Integer n2=Integer.valueOf(n); // boxing
		
		int n3=n2;
		System.out.println(n3 +" :autounboxing");
	}
}

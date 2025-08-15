class  unboxing
{
	public static void main(String[] args) 
	{
		int num=123; //premitive
		
		Integer num2=Integer.valueOf(num); //Wrapperclass
		
		int num3=num2.intValue(); // wrapperclass to premitive
		
		System.out.println(num +": premitive   "); // premitive
		System.out.println(num2+": wrapperclass");// wrapperclass
		System.out.println(num3+": premitive   ");// premitive
	}
}

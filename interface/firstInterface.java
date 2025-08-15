interface A
{  
	public static final int a=10;
	void M1();
	void M2();
	default void m3(){
		System.out.println("from super non static method");
	}
	  public static void m4(){
			System.out.println("from super non static method"+a);
	}
}

class B implements A
{
	@Override
		public void M1(){
	     System.out.println("from M1()");
	}
	
	@Override
		public void M2(){
			System.out.println("from M2()");
		}
}

class  firstInterface
{
	public static void main(String[] args) 
	{
		B obj=new B();
		
		obj.M1();
		obj.M2();
		obj.m3();
		A.m4();
	}
}

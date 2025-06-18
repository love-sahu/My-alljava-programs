class father{
	public void habit(){
		System.out.println("drinking");
	}
}
class son extends father
{
	public void habit(){
		System.out.println(" not drinking ");
	}
}
class son2 extends father
{
	public void habit(){
		System.out.println("drinking and driveing");
		}
}
class overrideMethod{
   public static void main(String[] args){
	
	
	father obj1=new son();
	obj1.habit();
	
	father obj2=new son2();
	obj2.habit();
	
	father obj3=new father();
	obj3.habit();
   }
   
}
import java.util.*;
class EnumerationCursor 
{
	public static void main(String[] args) 
	{
		// only use with legecy classses
		Vector<Integer> vector=new Vector<>();
		for(int i=10;i<=100;i+=10){
			vector.add(i);
		}
		System.out.println(vector);
		Enumeration obj=vector.elements();
		while(obj.hasMoreElements()){
			System.out.println(obj.nextElement());
			obj.nextElement();
			}
	}
}

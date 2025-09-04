import java.util.*;
class  IteratorCursor
{
	@SuppressWarnings("unchecked")	
	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		
		list.add(10);
		list.add("love");
		list.add(50);
		list.add('A');
		list.add(false);
		list.add(40.5);
		list.add(true);
			System.out.println(list);
		Iterator obj=list.iterator();
	while(obj.hasNext()){
		Object o=obj.next();
		if(!(o instanceof Integer)){
			obj.remove();
		}
	}
	System.out.println(list);
	}
}

import java.util.*;
class ListiteratorExample
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list=new LinkedList<>();
		for(int i=1;i<=20;i++){
			list.add(i);
		}
		System.out.println(list);
		
		ListIterator<Integer> obj=list.listIterator();
		while(obj.hasNext()){
			System.out.println(obj.nextIndex()+" "+obj.next());
		}
		while(obj.hasPrevious()){
			System.out.println(obj.previousIndex()+" "+obj.previous());
		}
		while(obj.hasNext()){ 
			
			 if(obj.next()>=20)obj.add(100);
			/*
			//if(obj.next()<=5)obj.remove();//remove() deletev
			 if(obj.next()>=10)obj.set( 0);//set()  update
			else{
				obj.set( 1);
			}*/
		}
		System.out.println(list);
	}
}

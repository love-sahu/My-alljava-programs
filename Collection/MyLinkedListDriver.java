import java.util.*;
class MyNoSuchElementException extends RuntimeException{
   
      MyNoSuchElementException (String desc){
		super(desc);
      }
    
}
class MyindexOutOfBoundException extends RuntimeException
{
	MyindexOutOfBoundException(String desc){
		super(desc);
	}
}
class MyLinkedList <E> 
{
	
		Node<E> head;
		Node<E> tail;
		int index;
		
		private class Node<E>{
			E ele;
			Node<E> next;
			
			public Node(E ele){
				this.ele=ele;
			}
		}
		
		public String toString(){
			String data="[";
			if(index==0)return "[]";
			else{
				Node<E> currNode=head;
				while(currNode.next!=null){
					data+=currNode.ele+", ";
					currNode=currNode.next;
				}
				data+=tail.ele+"]";
			}
			return data;
		}
		public void add(E ele){
			Node<E> newNode=new Node<>(ele);
			if(index==0){
				head=newNode;
				tail=newNode;
			} 
			else{
				Node<E> currNode=head;
				while(currNode.next!=null){
					currNode=currNode.next;
				}
				currNode.next=newNode;
				tail=newNode;
				
			}
			index++;
		}
		public int size(){
			return index;
		}
		public void addFirst(E ele){
		 Node<E> newNode=new Node<>(ele);	
			if(head==null)head=newNode;
			else{
				newNode.next=head;
				head=newNode;
			}
			if(index==0)tail=newNode;
			index++;
		}
		public E getFirst(){
			
			if(head==null)
				throw new MyNoSuchElementException("");
			return head.ele;
		}
		public E getlast(){
			if(head==null)
				throw new MyNoSuchElementException("");
			return tail.ele;
		}
		public void clear(){
	        head=null;
			tail=null;
			index=0;
		}
       public E removeFirst(){
			if(index==0) throw new MyNoSuchElementException("");
			E temp=head.ele;
			
				head=head.next;
				if(index==1){ 
				tail=null;
				
				}
			
				index--;
			return temp;
		}
		public E removeLast(){
			if(index==0) throw new MyNoSuchElementException("");
			E temp=tail.ele;
			Node<E> currNode=head;
			for(int i=0;i<size()-1;i++){
				currNode=head.next;
			}
			tail=currNode;
			if(index==1){
				tail=null;
				head=null;
			}
			index--;
			return temp;
		}
		public E get(int index){
			if(index >= size() ||index<0) throw new MyindexOutOfBoundException("Index: "+index+", Size: "+size());
			Node <E> currNode=head;
			
			for(int i=0;i<index;i++){
				currNode=currNode.next;
				
			}
			
			return currNode.ele;
		}
		
		public E set(int index, E element){
			if(index >= size() ||index<0) throw new MyindexOutOfBoundException("Index: "+index+", Size: "+size());
			
			Node<E> currNode=head;
			for(int i=0;i<index;i++){
				currNode=currNode.next;
			}
			
			E temp=currNode.ele;
			currNode.ele=element;
			return temp;
		}
	}

class MyLinkedListDriver
{
	public static void main(String[] args){
	
		LinkedList<Integer> list2=new LinkedList<>();
		list2.add(200);
		list2.add(150);
		list2.add(180);
		list2.add(190);
		//System.out.println(list2.get(5));
		System.out.println(list2);
		
		
		System.out.println("_________________________");
		
	    MyLinkedList<Integer> list=new MyLinkedList<>();
		list.add(200);
		list.add(150);
		list.add(180);
		list.add(190);
			
		System.out.println(list);
	    System.out.println(list.set(2,52));
			System.out.println(list);
	}
}

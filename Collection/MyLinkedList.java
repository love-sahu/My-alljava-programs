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
			return "[]";
		}
	}

class MyLinkedListDriver
{
	public static void main(String[] args){
		MyLinkedList<Integer> list=new MyLinkedList<>();
		System.out.println(list);
	}
}

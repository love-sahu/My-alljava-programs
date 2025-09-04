class MyEmptyStackException extends RuntimeException
{
	public MyEmptyStackException(){
		super();
	}
}
class MyStack<E>
{
	static final int INITIAL_CAPACITY=10;
	E[] arr;
	int index=0;
	public MyStack(){
		super();
		arr=(E[])new Object[INITIAL_CAPACITY];
	}
	private int newCapacity(int oldcapacity){
		return oldcapacity*2;
	}
	public  int size(){
		return index;
	}
	@Override
	public String toString(){
		String data="";
			if(index==0)return "[]";
		else{
			for(int i=0;i<size()-1;i++){
				data+=arr[i]+", ";
			}
			data+=arr[size()-1]+"]";
		}
		return data;
	}
	public boolean isEmpty(){
		return index==0;
	}
	public  E puch(E ele){
		if(size()==arr.length){
			E[]newArr=(E[]) new Object[newCapacity(arr.length)];
			for(int i=0;i<arr.length;i++){
				newArr[i]=arr[i];
			}
			arr=newArr;
		}
		arr[index++]=ele;
		return ele;
	}
	public E pop(){
		if(index==0) throw new MyEmptyStackException();
		int temp=arr[size()-1];
		arr[size()-1]=null;
		index--;
		return temp;
	}	
}

class MystackDriver
{
	public static void main(String[] args) 
	{
	MyStack<Integer> stack=new MyStack<>();	
	System.out.println(stack.size());
	System.out.println(stack.push(100));
	System.out.println(stack);
	}
}

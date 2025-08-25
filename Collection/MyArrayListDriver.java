import java.util.*;

class MyArraylistIndexOutOfBoundException extends RuntimeException {
    public MyArraylistIndexOutOfBoundException(String desc) {
        super(desc);
    }
}

class MyArrayList<E> {

    static final int CAPACITY = 10;
    E[] arr;
    int index = 0;

    public MyArrayList() {
        this(CAPACITY);
    }

    public MyArrayList(int capacity) {
        arr = (E[]) new Object[capacity];
    }

    public boolean add(E ele) {
        if (arr.length == size()) {
            E[] newArr = (E[]) new Object[getCapacity(arr.length)];
            for (int i = 0; i < size(); i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[index++] = ele;
        return true;
    }

    public void add(int index, E ele) {
        if (index < 0 || index >= size()) {
            throw new MyArraylistIndexOutOfBoundException(
                "Index " + index + " out of bound for length " + size()
            );
        }
        if (arr.length == size()) {
            E[] newArr = (E[]) new Object[getCapacity(arr.length)];
            for (int i = 0; i < size(); i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        for (int i = size() - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = ele;
        this.index++;
    }
	
	public boolean addAll(MyArrayList coll){
		
			boolean flag=false;
			for(int i=0;i<coll.size();i++){
			if(add((E)coll.get(i))) flag= true;
			}
		
		return flag;
	}
	
	
	public E set(int index,E ele){
		   if (index < 0 || index >= size()) {
            throw new MyArraylistIndexOutOfBoundException(
                "Index " + index + " out of bound for length " + size()
            );
        }
		 E temp=arr[index];
		 arr[index]=ele;
		 return temp;
	}
	public boolean isEmpty(){
		return (size()==0)?true:false;
	}
	
	public E get(int index){
		   if (index < 0 || index >= size()) {
            throw new MyArraylistIndexOutOfBoundException(
                "Index " + index + " out of bound for length " + size()
            );
        }
		return arr[index];
	}

    public int getCapacity(int oldcapacity) {
        return (int) (oldcapacity * 1.5);
    }

    public int size() {
        return index;
    }
	public void clear(){
		arr=(E[])new Object[arr.length];
		index=0;
	}
public boolean contains(E element){
	for(int i=0;i<size();i++){
		if(arr[i].equals(element))return true
	}
		return false;
}
public boolean remove(int index){
	  if (index < 0 || index >= size()) {
            throw new MyArraylistIndexOutOfBoundException(
                "Index " + index + " out of bound for length " + size()
            );
        }
		for(int i=index;i<size();i++){
			arr[i]=arr[i+1];
		}
		this.index--;
		return true;
}
 public int indexOf(E element){
	for(int i=0;i<size();i++){
		if(arr[i].equals(element))return i;
	}
	return -1;
 }
 public int lastIndexOf(E ele){
	for(int i=size()-1;i>=0;i--){
		if(arr[i].equals(element))return i;
	}
	return -i;
 }
 //public boolean removeAll()
    @Override
    public String toString() {
        if (size() == 0) return "[]";
        String data = "[";
        for (int i = 0; i < size() - 1; i++) {
            data += arr[i] + ",";
        }
        data += arr[index - 1] + "]";
        return data;
    }
}

class MyArrayListDriver {
    public static void main(String[] args) {
        MyArrayList list2 = new MyArrayList();
		System.out.println(list2.isEmpty());
        System.out.println(list2.add(21));
		System.out.println(list2.isEmpty());
        System.out.println(list2.add(22)c);
        System.out.println(list2.add(23));
        System.out.println(list2.add(24));
        System.out.println(list2.add(25));
        System.out.println(list2.size());
        System.out.println(list2.add(26));
        System.out.println(list2.add(27));
        System.out.println(list2.add(28));
        System.out.println(list2.add(25));
		
        System.out.println(list2.add(25));
        System.out.println(list2.add(25));
      
	  
	  System.out.println("___________________________");
	  System.out.println(list2.get(2));
	  
	  
	  MyArrayList list1=new MyArrayList();
	      System.out.println( list1.add(1));
		  System.out.println( list1.add(2));
		  
		  System.out.println(list2.addAll(list1));
		  System.out.println(list2);
		  
		  
		  
			  System.out.println(list1.set(0,99));
			   System.out.println(list1);
			   
			    list1.clear();
				 System.out.println(list1);
    }
}

import java.util.*;
class Name_Sort 
{
	public static void main(String[] args) 
	{
		String arr[]={"RAMESH","MUKESH","JAYESH","RAKESH","SIDDESH","EAJESH"};
		sortAssending(arr,arr.length);
	}
	public static void	sortAssending(String arr[],int len){
		for(int i=0;i<len;i++){
			for(int j=0;j<len-1;j++){
				if(arr[j].compareTo(arr[j+1])>0){
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.print(Arrays.toString(arr));
	}
}

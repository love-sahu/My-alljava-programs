import java.util.*;
class  descendingBoobleSort
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5,1,2,5,5,6,15,5,5,5,15,15,15,15,1};
	
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
			
				if(arr[j]<arr[j+1]){
					int temp=arr[i];
					arr[i]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

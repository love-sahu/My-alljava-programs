import java.util.*;
class  shiftAllpositive
{
	public static void main(String[] args) 
	{
		int arr[]={-1,2,-2,5,-44,8,-99};
			int min=0;
			int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						}
			}
			
		}
	System.out.println(Arrays.toString(arr));
}
}
/*
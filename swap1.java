import java.util.*;
class  swap1
{
	public static void main(String[] args) 
	{
		int []arr={1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				for(int j=0;j<arr.length;j++){
					if(arr[j]%2==0){
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		System.out.print(Arrays.toString(arr));
	}
}

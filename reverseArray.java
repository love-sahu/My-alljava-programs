import java.util.*;
class  reverseArray  //clockwise
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,54,5,7,8,5,99};
		System.out.println(Arrays.toString(arr));
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rotation");
		int rotation=sc.nextInt();
		
		
		clockwiseRotation(arr,rotation);
		System.out.println(Arrays.toString(arr));
	}
	public static void clockwiseRotation(int arr[],int rotation){
		for(int i=1;i<=rotation;i++){
			int first=arr[0];
			for(int j=1;j<arr.length;j++){
				arr[j-1]=arr[j];
				
			}
			arr[arr.length-1]=first;
		}
	}
}

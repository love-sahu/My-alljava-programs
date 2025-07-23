import java.util.*;
class makeEvenOdd
{
	public static void main(String args[]){
		int arr[]={1,2,3,4,5,6,7,8,9,10,11,13,12};
		System.out.print(Arrays.toString(arr));
		System.out.println();
		for(int i=0;i<arr.length;i++){
			if(iseven(arr[i])){
				arr[i]=arr[i]+1;
			}
			else{
				arr[i]=arr[i]-1;
			}
		}
		System.out.print(Arrays.toString(arr));
	}
	public static boolean iseven(int n){
		if(n%2==0)return true;
		else {return false;}
	}
}
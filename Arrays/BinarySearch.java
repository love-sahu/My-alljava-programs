import java.util.*;
class BinarySearch
 
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5,6,7,8,9,10,11,50};
		int ans[]=Search( arr,0,arr.length-1,5);
		System.out.println(Arrays.toString(ans));
	}
	
	// binary search using recursion
	public static int[] Search(int arr[],int s,int e,int k){
		int mid=(s+e)/2;
        if(arr[mid]==k)return new int[]{mid,arr[mid]};
        if(arr[mid]>k)return Search(arr,s,mid-1,k);
		return Search(arr,mid+1,e,k);
		
	}
	
	//binary search
	/*public static int[] Search(int arr[],int key){
		
		int s=0;
		int e=arr.length-1;
		while(s<=e){
			int mid=s+(e-s)/2;
			if(arr[mid]>key){e=mid-1;}
			else if(arr[mid]<key){s=mid+1;}
			else return new int[]{mid,arr[mid]};
		}
		return new int[]{-1, -1};

} */
}

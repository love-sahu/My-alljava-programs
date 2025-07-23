import java.util.*;
class  Marge2arrays
{
	public static void main(String[] args) 
	{
		int nums1[]={1,5,2,5,5,2,1,2};
		int nums2[]={4,5,6,2,5,5,5};
		int arr[]=new int [nums1.length+nums2.length];
    for(int i=0,j=0;i<arr.length;i++){
      if(i<nums1.length) arr[i]=nums1[i];
      else{
        arr[i]=nums2[j++];
      }
    }
	System.out.print(Arrays.toString(arr));
	}
}

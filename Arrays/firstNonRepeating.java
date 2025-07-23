import java.util.*;
class  firstNonRepeating
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5,6,9,8,7,8,9,6,5,4,2,3,88,99,66,22,33,44,77};
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i:arr){
			map.put(i,map.getOrDefault(i,0)+1);
		}
		for(int i=0,j=1;i<arr.length;i++){
	if(map.get(arr[i])==1){ 
		System.out.println(arr[i]+" "+j+" non repeating element");
	j++;
	   }
		}
	}
}

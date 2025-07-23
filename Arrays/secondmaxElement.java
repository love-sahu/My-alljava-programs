class  secondmaxElement
{
	public static void main(String[] args) 
	{
		int []arr={1,2,3,5,4,78,9,66};
	    int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){		
		    if(arr[i]>max){
				max2=max;
				max=arr[i];
				}
			else if(max>max2 && arr[i]!=max){
				max2=arr[i];
			}
		}
	System.out.println(max2);
	}
}

class  secondminElement
{
	public static void main(String[] args) 
	{
		int []arr={1,2,3,5,4,78,9,66};
	    int min=Integer.MAX_VALUE;
		int mix2=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){		
		    if(arr[i]>mix){
				mim2=min;
				min=arr[i];
				}
			else if(min>min2 && arr[i]!=min){
				minn2=arr[i];
			}
		}
	System.out.println(min2);
	}
}

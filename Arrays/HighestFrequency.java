class firstHighestFrequency 
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5,6,7,8,5,4,2,1,1,1,1,1,1,1,2,2,2,2,2,2,2};
		boolean arr2[]=new boolean[arr.length];
		int maxfreqvalue=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length-1;i++){
			int count=0;
			for(int j=0;j<arr.length;j++){
				if((arr[i]==arr[j] )&& arr2[j]==false){
					count++;
					arr2[j]=true;
					}
			}
		if(count>max)
				max=count;
			    maxfreqvalue=arr[i];
			}
			System.out.println("firstHighestFrequency"+maxfreqvalue+" :"+max);
	}
}

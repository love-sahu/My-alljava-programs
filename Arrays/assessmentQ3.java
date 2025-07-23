class assessmentQ3 
{
	public static void main(String[] args) 
	{
		int arr[]={16,17,3,4,5,2};
		for(int i=0;i<arr.length;i++){
			boolean flag=false;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j])flag=true;
			}
			if(!flag){
				System.out.print(arr[i]+" ");
				}
		}
	}
}

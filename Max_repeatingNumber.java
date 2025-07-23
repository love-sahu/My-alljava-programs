class Max_repeatingNumber {
   	public static void main(String[] args) 
	{
		int arr[]={1,1,0,0,1,1,1,1,0};
		int n=0;
     	int ans=0;
			for(int j=0;j<arr.length;j++){
				if(arr[j]==1){
					n++;
					ans=Math.max(ans,n);
					}
					else{
						n=0;
					}
			}
			
			System.out.print(ans);
		}
	
	}

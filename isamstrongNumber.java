class isamstrongNumber 
{
	public static void main(String[] args) 
	{
		int arr[]={153,9474,451};
		int n=arr.length;
		for(int i=0;i<n;i++){
		    if(isamstrong(arr[i])){
				System.out.print(arr[i]+" ");
		    }
		}
	}
	public static boolean isamstrong(int n){
		int length=length(n);
		 int sum= 0;
		 for(int i=n;i>0;i/=10 ){
			sum+=power(i%10,length);
		 }
		
		 return n==sum;
	}
	public static int length(int n){
		int cnt=0;
		for(int i=n;i!=0;i/=10){
			cnt++;
	     }
		 	 
		 return cnt;
	}
	public static int power(int n,int pow){
		int op=1;
		for(int i=pow;i>0;i--){
			op*=n;
		}
		
		return op;
	}
}

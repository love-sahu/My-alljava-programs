class missingNumberInarr {
   	public static void main(String[] args) 
	{
		int arr[]={1,2,4,5};
			for(int i=arr[0];i<=arr[arr.length-1];i++){
			     boolean f=false;
			for(int ele:arr){
			   
			    if(i==ele){
			        f=true;
			    }
			  
			}
			  if(!f){
			        System.out.println(i);
			    }
			  }
			}
			
		}
	
	

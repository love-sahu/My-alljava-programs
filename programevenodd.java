import java.util.*;
class programevenodd{
    public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("enter"+(i+1)+"index value");
			arr[i]=sc.nextInt();
		}
	    if(count(arr)=="equal"){
		if(arr[0]%2==0){
			for(int i=1;i<n;i++){
				if(arr[i]%2!=0){arr[i]=arr[i]+1;}
			}
		}
		else if(arr[0]%2!=0){
			for(int i=1;i<n;i++){
				if(arr[i]%2==0){arr[i]=arr[i]+1;}
			}
		}
		}
		else if(count(arr)=="evenismore"){
			for(int i=0;i<n;i++){
				if(arr[i]%2!=0){arr[i]=arr[i]+1;}
			}
		}
		else if(count(arr)=="oddismore"){
			for(int i=0;i<n;i++){
				if(arr[i]%2==0){arr[i]=arr[i]+1;}
			}
		}
		System.out.print(Arrays.toString(arr));
    }
		public static String count(int arr[]){
			int evenc=0;
			int oddc=0;
			for(int i=0;i<arr.length;i++){
				if(arr[i]%2==0)evenc++;
				else{oddc++;}
			}
			if(evenc>oddc){
				return "evenismore";
			}
			else if(evenc<oddc){
				return "oddismore";
			}
			else{
				return "equal";
			}
		}
}

import java.util.Scanner;
class baloontcs{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("enter your size of arr");
	int n=sc.nextInt();
	System.out.println("enter arr value");
	char arr[]=new char[n];
	for(int i=0;i<n;i++){
		arr[i] = sc.next().charAt(0);
	}
   int count=0;
	char c=arr[0]; 
	for(int i=1;i<n;i++){
		if(arr[i]!=c){
			System.out.print(c);
			return;
		}
		else{
			if(i+1<n){
				c=arr[i+1];
			i++;
			}
		}
		
		}
	}
	
}	


import java.util.Scanner;
class arrqtcs{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter array size");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.print("enter array values");
for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
}
int max=arr[0];
int count=1;
for(int i=1;i<arr.length;i++){ //78235
if(arr[i]>max){
	count++;
	max=arr[i];
}

}
System.out.print("count is"+count);
}
}
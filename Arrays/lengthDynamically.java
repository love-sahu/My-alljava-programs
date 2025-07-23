import java.util.Scanner;
class lengthDynamically{
  public static void main(String[]args){
	 int arr[]={1,2,3,4,5,6,7,8,9,4,5,1,4,5,1};
	 int length=0;
	 for(int i=0;true;i++){
		try{
			int a=arr[i];
		}
		catch(ArrayIndexOutOfBoundsException  ae){
			break;
		}
		length++;
	 }
	 System.out.print(length);
  }
}
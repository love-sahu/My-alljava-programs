import java.util.Scanner;
class nthprime
{
	public static void main (String args[]){
	  Scanner sc=new Scanner (System.in);
	  System.out.primt("enter number for prime");
	  System.out.prime(prime(5));
	}
	public static int prime(int n){//5
		int count=1;
		int nth=0;
		for(int i=2;i<1000;i++){
			if(count!=n){
				if(i%2==0){
					nth=i;
					count++;
				}
				
			}
			return nth;
		}
	}
}
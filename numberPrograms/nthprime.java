import java.util.Scanner;
class nthprime
{
	public static void main (String args[]){
	  Scanner sc=new Scanner (System.in);
	  System.out.println("enter number for prime");
	    System.out.println(nthprime(5));
         

	}
	public static int nthprime(int n){
	 int count = 0;
        int num = 1;  // Starting from 1 as first prime is 2

        while (count < n) {
            num++;
            if (prime(num)) {
                count++;
            }
        }
        return num;
	
	}
	public static boolean prime(int n){
		for(int i=2;i<n;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
		}
		
	}

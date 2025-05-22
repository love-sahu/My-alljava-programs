import java.util.Scanner;
class stringtcs{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter string");
		String s=sc.nextLine();
		int scount=0;
		int hcount=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='*'){
			scount++;
			}
			else if(s.charAt(i)=='#'){
				hcount++;
			}
		}
		
		System.out.print(scount-hcount);
	}
}

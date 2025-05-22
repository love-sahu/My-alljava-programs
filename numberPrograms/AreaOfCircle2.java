import java.util.Scanner;
class AreaOfCircle2{
public static void main (String args[]){
	Scanner sc=new Scanner(System.in);
int dimeter=sc.nextInt();
int r=dimeter*1/2;
double areaOfCircle=3.14*(r*r);
System.out.print(areaOfCircle);
}
}
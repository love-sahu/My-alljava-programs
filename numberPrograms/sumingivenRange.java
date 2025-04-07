import java.util.Scanner;

public class sumingivenRange {
 public static void main(String[] args) {
  System.out.println(range(10, 20));
 }
 public static int range(int n,int n2){
int nn=n2*(n2+1)/2;
System.out.println(nn);
 return nn-n;
 }
}

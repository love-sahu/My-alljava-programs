import java.util.Scanner;

public class prac {
  public static void main(String args[]) {
    // for (int i = 0; i <= 127; i++) {
    // System.out.print(i + " :" + ((char) i));
    // }
    // System.out.println();
    // for (int i = 0; i <= 10; i++) {
    // System.out.print(i + " ");
    // }
    // System.out.println();
    // for (char ch = 'A'; ch <= 'Z'; ch++) {
    // System.out.print(ch + " ");
    // }
    // System.out.println();
    // for (char ch = 'Z'; ch >= 'A'; ch--) {
    // System.out.print(ch + " ");
    // }
    // System.out.println();
    // for (char i = '0'; i <= '9'; i++) {
    // System.out.print(i + " ");
    // }

    // Scanner sc = new Scanner(System.in);
    // System.out.print("enter your number ");
    // int num = sc.nextInt();
    // System.out.print("enter your range");
    // int range = sc.nextInt();

    // for (int i = 1; i <= range; i++) {
    // System.out.println(num + "X" + i + "=" + (num * i));

    // }
    int a = 1;
    for (char i = 'A'; i <= 'Z'; i += a) {
      System.out.print(i + " ");
      a++;
    }
  }
}
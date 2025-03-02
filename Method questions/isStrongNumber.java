import java.util.Scanner;

public class isStrongNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    boolean isStrong = isStrong(input);
    System.out.println(isStrong + " " + input + ":Strong number");
  }

  public static boolean isStrong(int n) {
    int sum = 0;
    for (int i = n; i > 0; i /= 10) {
      int last = i % 10;
      sum = sum + factorial(last);
    }
    return sum == n;
  }

  public static int factorial(int n) { // 5*4*3*2*1
    int fact = 1;
    for (int i = n; i >= 1; i--) {
      fact *= i;
    }
    return fact;
  }

}

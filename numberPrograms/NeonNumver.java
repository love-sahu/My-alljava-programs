import java.util.Scanner;

public class NeonNumver {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int dup = num;
    // int length = 0;
    // int div = 1;
    // for (int i = num; i > 0; i /= 10) {
    // length++;
    // }
    // System.out.println(length);
    // for (int j = 1; j <= length; j++) {
    // div *= 10;
    // }
    // System.out.println(div);
    int comninenum = num * num;
    // System.out.println(comninenum);
    int sum = 0;

    while (comninenum > 0) {
      sum += comninenum % 10;
      // System.out.println(sum);
      comninenum /= 10;
    }
    if (sum == dup) {
      System.out.println(num + " :is neon number");
    } else {
      System.out.println(num + " : is not neon number");
    }
  }
}

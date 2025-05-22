import java.util.Scanner;

public class SumOfFactorialofdigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    // .223
    int sum = 0;
    while (num > 0) {
      int rem = num % 10;
      int fact = 1;
      for (int i = 1; i <= rem; i++) {
        fact *= i;
      }
      sum += fact;
      num /= 10;
    }

    System.out.println(sum);
  }
}

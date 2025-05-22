
import java.util.Scanner;

public class sumOfprimeNum {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = 0;
    while (num > 0) {

      int rem = num % 10;
      if (rem % 2 == 0) {
        sum += rem;
      }

      num /= 10;
    }
    System.out.println(sum);
  }
}

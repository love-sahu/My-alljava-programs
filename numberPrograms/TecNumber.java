import java.util.Scanner;

public class TecNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int length = 0;
    int sum = 0;
    for (int i = number; i > 0; i /= 10) {
      length++;
    }

    if (length % 2 == 0) {
      int div = 1;
      for (int i = 1; i <= length / 2; i++) {
        div *= 10;
      }
      System.out.println(div);

      int rh = number % div;
      int lh = number / div;

      sum = (rh + lh);
      int sqr = sum * sum;
      System.out.println(sum);
      System.out.println(sqr == number ? number + "is tec number" : number + "is not tec number");

    } else {
      System.out.println("is not tec number");
    }

  }
}

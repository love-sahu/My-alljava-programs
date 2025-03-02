import java.util.Scanner;

public class AmstrongNum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int dup = number;
    int length = 0;
    int sum = 0;
    for (int i = number; i > 0; i /= 10) {
      length++;
    }
    System.out.println(length);
    while (number > 0) {
      int rem = number % 10;
      int fec = 1;

      for (int i = 1; i <= length; i++) {
        fec *= rem;
      }
      number /= 10;
      sum += fec;

    }

    if (sum == dup) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
  }
}

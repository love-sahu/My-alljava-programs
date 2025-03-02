
import java.util.Scanner;

public class PrimeFromwhile {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int den = 2;
    while (den < num) {
      if (num % den == 0) {
        break;
      }
      den++;
      System.out.println(den);

    }

    if (num == den) {
      System.out.println("prime number");
    } else {
      System.out.println("not prime");
    }
  }
}

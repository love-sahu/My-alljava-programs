
import java.util.Scanner;

public class primefromCount {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);6tf
    int num = 12;
    int count = 0;
    for (int i = 2; i < num / 2; i++) {
      if (num % i == 0) {
        count++;
      }
      System.out.println(i);
    }
    // prime or not
    if (count == 0) {
      System.out.println("the number is prime number");
    } else {
      System.out.println("number is not prime number");

    }
  }
}

import java.util.Scanner;

public class OddEvenWithout {
  public static void main(String[] args) {
    int num = new Scanner(System.in).nextInt();

    System.out.println((num / 2) * 2 == num);
    System.out.println(num / 2 == num / 2.0);
  }
}

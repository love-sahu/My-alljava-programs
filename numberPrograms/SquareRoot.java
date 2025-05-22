import java.util.Scanner;

public class SquareRoot {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    // int num = 36;
    boolean flag = false;
    // int sqrt = 1;
    for (int i = 1; i <= num; i++) {
      if (i * i == num) {
        flag = true;
        System.out.println(i + "is perfect square");
      }
      if (i * i > num) {
        break;
      }
    }
    if (!flag) {
      System.out.println("is not perfect square");
    }

  }
}

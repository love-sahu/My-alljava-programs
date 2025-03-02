
import java.util.Scanner;

public class goodprimeNumber {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int range = sc.nextInt();
    int count = 0;
    for (int i = 2; i <= range; i++) {
      boolean flag = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          flag = false;
          break;
        }
      }
      if (flag) {
        if (i < 10) {
          count++;

        } else {
          int rem = i % 10;
          for (int j = 2; j < rem; j++) {
            if (rem % j != 0) {
              continue;
            } else {
              break;
            }
          }
          i /= 10;
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
/*
 * if (flag) {
 * boolean f1 = true;
 * while (i > 0) {
 * int rem = i % 10;
 * if (rem % 2 != 0) {
 * f1 = false;
 * break;
 * }
 * i = i / 10;
 * }
 * if (!f1) {
 * count++;
 * }
 * 
 * }
 */
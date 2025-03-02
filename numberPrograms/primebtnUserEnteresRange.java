import java.util.Scanner;

public class primebtnUserEnteresRange {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int range = sc.nextInt();

    for (int i = 2; i <= range; i++) {
      boolean flag = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          flag = false;
          break;
        }
      }
      if (flag) {
        System.out.print(i + " ");
      }
    }

  }
}
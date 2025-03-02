import java.util.Scanner;

public class EmirpNunber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int dupnumber = number;
    boolean flag = true;
    for (int i = 2; i < number / 2; i++) {
      if (number % i == 0) {
        flag = false;
        break;
      }
    }
    if (flag) {
      int rev = 0;
      boolean flag2 = true;
      while (number > 0) {
        int rem = number % 10;
        rev = (rev * 10) + rem;
        number /= 10;
      }
      for (int i = 2; i < rev / 2; i++) {
        if (rev % i == 0) {
          flag = false;
          break;
        }
      }
      if (flag2) {
        System.out.print("given number:" + dupnumber + "is Emirp number");
      }

    } else {
      System.out.print("not Emirp");
    }
  }
}

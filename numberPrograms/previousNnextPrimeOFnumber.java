import java.util.Scanner;

public class previousNnextPrimeOFnumber {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();// 12
    int pprime = 0;
    int nprime = 0;
    for (int i = num - 1; num >= 2; i--) {
      boolean flag = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          flag = false;
          break;
        }
      }
      if (flag == true) {
        pprime = i;
        break;
      }

    }

    for (int i = num + 1;; i++) {
      boolean flag = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          flag = false;
          break;
        }
      }
      if (flag == true) {
        nprime = i;
        break;
      }

    }
    System.out.println(pprime + ":privious prime");
    System.out.println(nprime + ":next prime");
    if (num - pprime == nprime - num) {
      System.out.println(pprime + ":" + num + ":" + nprime);
    } else if (num - pprime < nprime - num) {
      System.out.println(pprime + ":" + num);
    } else if (num - pprime > nprime - num) {
      System.out.println(num + ":" + nprime);
    }
  }
}

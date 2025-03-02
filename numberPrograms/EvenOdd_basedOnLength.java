import java.util.Scanner;

public class EvenOdd_basedOnLength {
  // 1234
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    // int duplicate = num;
    int number1 = num;

    int count = 0;
    while (num > 0) {
      int rem = num % 10;
      count++;
      num /= 10;
    }
    int org = 0;
    // System.out.println(count + "c");
    if (count % 2 == 0) {
      int rev = 0;

      while (number1 > 0) {
        int rem = number1 % 10; // 1234%10==4
        if (rem % 2 != 0) {
          rem = rem + 1;
        }
        rev = rev * 10 + rem;
        number1 /= 10;
      }
      while (rev > 0) {
        int rem = rev % 10;
        org = org * 10 + rem;
        rev /= 10;
      }
      System.out.println(org + ":converted in even");
      // if(num.length%2==0)
    } else {
      int rev = 0;

      while (number1 > 0) {
        int rem = number1 % 10; // 1234%10==4
        if (rem % 2 == 0) {
          rem = rem - 1;
        }
        rev = rev * 10 + rem;
        number1 /= 10;
      }
      while (rev > 0) {
        int rem = rev % 10;
        org = org * 10 + rem;
        rev /= 10;
      }
      System.out.println(org + ":converted in odd");
    }
  }
}

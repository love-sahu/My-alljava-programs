
import java.util.Scanner;

public class Calculator_using_operator {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter operator 1");
    float num1 = sc.nextFloat();
    System.out.println("enter operator 2");
    float num2 = sc.nextFloat();
    System.out.println("enter operand for performing operation");

    char opt = sc.next().charAt(0);
    int ans = 0;
    ans = (int) ((opt == '*') ? (num1 * num2)
        : (opt == '/') ? (num1 / num2)
            : (opt == '-') ? (num1 - num2)
                : (opt == '+') ? (num1 + num2) : 0.0000001f);
    String output = num1 + " " + opt + " " + num2 + " is " + ans;

    if (!(ans == 0.0000001f))
      ;
    System.out.print(output);
  }
}

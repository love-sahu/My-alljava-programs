import java.util.Scanner;

public class DuckNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String number = sc.nextLine();
    boolean flag = true;
    for (int i = 1; i < number.length(); i++) {
      char ch = number.charAt(0);
      if (ch == '0') {
        // System.out.println(number + ": is not duck number");
        flag = false;
        break;
      } else {
        if (number.charAt(i) != '0') {
          flag = false;
        } else {
          flag = true;
        }

      }
    }
    if (flag) {
      System.out.println(number + " : is duc number");
    } else {
      System.out.println(number + " : is not duck number");
    }
  }
}

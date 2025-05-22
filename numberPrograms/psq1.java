import java.util.Scanner;

public class psq1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int count1 = 0;
    int count2 = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '1') {
        count1++;
      } else {
        count1 = 0;
      }
      if (str.charAt(i) == '0') {
        count2++;
      }

      else {

        count2 *= 0;
      }
    }
    System.out.println(count1 >= 7 || count2 >= 7 ? "yes" : "not");
  }
}

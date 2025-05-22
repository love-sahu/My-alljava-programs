import java.util.Scanner;

public class stringlengthgreterThen7 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int count1 = 0;
    int count2 = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '1') {
        count1++;
      }

      else if (str.charAt(i) == '0') {
        count2++;
      } else {
        count1 = 0;
        count2 = 0;
      }
    }
    if (count1 >= 7 || count2 >= 7) {
      System.out.print(" yes ");
    } else {
      System.out.println("no");
    }
  }
}

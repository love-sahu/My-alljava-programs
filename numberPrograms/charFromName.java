import java.util.Scanner;

public class charFromName {
  public static void main(String[] args) throws InterruptedException {

    Scanner sc = new Scanner(System.in);
    String name = sc.next().toUpperCase();
    int length = name.length();

    for (int i = 0; i <= length - 1; i++) {
      System.out.println(name.charAt(i));
      Thread.sleep(2000);
    }
  }
}
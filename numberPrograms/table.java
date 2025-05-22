import java.util.Scanner;

public class table {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter uour number for generating table");
    int number = sc.nextInt();
    System.out.println("enter your range");
    int rangs = sc.nextInt();

    for (int i = 1; i <= rangs; i++) {
      int table = number * i;
      System.out.println(table + " :" + i);

    }
  }
}

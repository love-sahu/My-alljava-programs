import java.util.Scanner;

public class if_statement2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("you payed money ");
    boolean ip = sc.nextBoolean();
    if (ip) {
      System.out.println(" do the class");
    }
    System.out.println("pay the bill");
  }
}

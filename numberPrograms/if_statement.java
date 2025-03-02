import java.util.Scanner;

public class if_statement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double bill = sc.nextDouble();

    if (bill > 2000) {
      bill -= bill * 0.1;
    }
    System.out.println(bill);
  }
}

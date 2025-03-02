import java.util.Scanner;

public class conversion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter  Celsious value");
    double c = sc.nextDouble();
    double fahrenhite = c * (9.0 / 5.0) + 32;
    System.out.println("converted celsious in to feherneit value is " + fahrenhite);
  }
}

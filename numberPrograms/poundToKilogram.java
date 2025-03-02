import java.util.Scanner;

public class poundToKilogram {
  public static void main(String[] args) {
    double pound =new Scanner(System.in).nextDouble();

    double kilogram = 0.454 * pound;
    System.out.print("the value of pound into kilofram is " + kilogram);
  }
}

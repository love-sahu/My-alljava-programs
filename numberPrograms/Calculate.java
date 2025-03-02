import java.util.Scanner;

public class Calculate {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float subtotal = sc.nextInt();
    float gratuity = sc.nextInt();

    float tip = gratuity / 100;
    float total = 0;
    System.out.println("the tip is" + tip + "and total is" + total);
  }
}

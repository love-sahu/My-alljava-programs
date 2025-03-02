import java.util.Scanner;

public class AreaOfCircle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int radius = sc.nextInt();
    final int pi = 22 / 7;
    float ans = pi * (radius * radius);
    System.out.println("area of given value radius " + radius + "is " + ans + "cm^2");
  }
}

import java.util.Scanner;

public class powerofnumber {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter your number");
    int num = sc.nextInt();
    System.out.print("enter power: ");
    int power = sc.nextInt();
    // 2 num
    // 3 power
    int op = 1;
    for (int i = 1; i <= power; i++) {
      op *= num;
    }
    System.out.println(op + "");
  }
}
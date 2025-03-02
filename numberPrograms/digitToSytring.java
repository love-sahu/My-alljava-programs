import java.util.Scanner;

//123
public class digitToSytring {
  public static void main(String argh[]) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    String name = "";
    while (number > 0) {
      int rem = number % 10; // 123%10=3//
      switch (rem) {
        case 0:
          name = "zero " + name;
          break;
        case 1:
          name = "one " + name;
          break;
        case 2:
          name = "two  " + name;
          break;
        case 3:
          name = "thre  " + name;
          break;
        case 4:
          name = "four  " + name;
          break;
        case 5:
          name = "five  " + name;
          break;
        case 6:
          name = "six  " + name;
          break;
        case 7:
          name = "seven  " + name;
          break;
        case 8:
          name = "eight  " + name;
          break;
        case 9:
          name = "nine  " + name;
          break;
        case 10:
          name = "ten  " + name;
          break;
      }
      number /= 10;
    }
    System.err.print(name);
  }
}
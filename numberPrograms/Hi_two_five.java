import java.util.Scanner;

public class Hi_two_five {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    String ans = ((n % 2 == 0) && (n % 5 == 0)) ? ("hi two hi five")
        : ((n % 2 == 0) ? ("hi two") : ((n % 5 == 0) ? ("hi five") : ("blank")));
    System.out.print(ans);
  }
}

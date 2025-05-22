import java.util.Scanner;

public class vovels {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int vovel = sc.next().charAt(0);

    String s = (vovel == 'a' || vovel == 'e' || vovel == 'i' || vovel == 'o' || vovel == 'u') ? ("vovels")
        : ("conjention");
    System.out.print(s);
  }
}

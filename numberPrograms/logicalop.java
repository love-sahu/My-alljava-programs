import java.util.Scanner;

public class logicalop {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    String a = (ch >= 'A' && ch <= 'Z') ? ("is upperCase")
        : ((ch >= 'a' && ch <= 'z') ? ("is lowerCase")
            : ((ch >= '0' && ch <= '9') ? ("digits") : ("special character")));

    System.out.println(a);
  }
}

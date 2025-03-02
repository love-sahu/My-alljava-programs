public class PalendromeNumber {
  public static void main(String[] args) {
    int num = 121;
    int duplicate = num;
    int rev = 0;
    while (num > 0) {
      int rem = num % 10;
      rev = rev * 10 + rem;
      num /= 10;
    }
    System.out.println(rev);
    if (rev == duplicate) {
      System.out.print("palendrom");
    } else {
      System.out.println("not palendrome");
    }
  }
}

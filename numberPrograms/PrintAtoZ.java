public class PrintAtoZ {
  public static void main(String[] args) {
    // A to Z
    for (char i = 65; i <= 90; i++) {
      System.out.print(i + " ");
    }
    System.out.println();
    for (char i = 90; i >= 65; i--) {
      System.out.print(i + " ");
    }
    // a to z
    System.out.println();
    for (char i = 97; i <= 122; i++) {
      System.out.print(i + " ");
    }
    System.out.println();
    // z to a
    for (char i = 122; i >= 97; i--) {
      System.out.print(i + " ");
    }
    System.out.println();
    // '0' to '9'
    for (char i = '0'; i <= '9'; i++) {
      System.out.print(i + " ");
    }
  }
}

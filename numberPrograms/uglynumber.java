public class uglynumber {
  public static void main(String []args) {

    System.out.println(uglynum(16));
  }

  public static boolean uglynum(int num) {
    while (num != 1) {
      if (num % 2 == 0) {
        num /= 2;
      } else if (num % 3 == 0) {
        num /= 3;
      } else if (num % 5 == 0) {
        num /= 5;
      } else {
        return false;
      }
    }
    return true;
  }
}

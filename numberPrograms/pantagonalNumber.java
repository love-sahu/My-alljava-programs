public class pantagonalNumber {
  public static void main(String[] args) {
   System.out.println( ispantagonal(5));
  }

  public static boolean ispantagonal(int n) {
    for (int i = 1; i <= n; i++) {
      int pentagonalnum = (3 * i * i - i) / 2;
      System.out.println(pentagonalnum);
      if (pentagonalnum == n) {
        return true;
      }
    }
    return false;
  }
}

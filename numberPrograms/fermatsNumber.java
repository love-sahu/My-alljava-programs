public class fermatsNumber {
  public static void main(String args[]) {
    System.out.println(fermatsNumber(4));
  }

  public static int fermatsNumber(int num) { // 2^2^n+1
    int fn = power(2, power(2, num)) + 1;
    return fn;
  }

  public static int power(int digit, int power) {
    int pow = 1;
    for (int i = 1; i <= power; i++) {
      pow *= digit;
    }
    return pow;
  }
}

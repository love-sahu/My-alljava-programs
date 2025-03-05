public class pascalTrangle {
  public static void main(String[] args) {
    pascalTrangle(5);
  }

  public static void pascalTrangle(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i ; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= i; k++) {
        System.out.print(" "+ factorial(i) / (factorial(k) * factorial(i - k)));
      }
      System.out.println();
    }
    return;
  }

  public static int factorial(int n) {
    int fact = 1;
    for (int i = n; i > 0; i--) {
      fact *= i;
    }
    return fact;
  }
}

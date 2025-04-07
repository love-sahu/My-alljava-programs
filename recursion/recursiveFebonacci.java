public class recursiveFebonacci {
  public static void main(String[] args) {
    fib(5, 0, 1);
  }

  // 5 0 1
  public static void fib(int n, int n1, int n2) {
    if (n > 0) {

      int n3 = n1 + n2;
      System.out.println(n1);
      fib(--n, n2, n3);
    }
    return;
  }
}

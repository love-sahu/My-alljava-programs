public class rangeOfPrimeNumber {
  public static void main(String[] args) {
    for (int start = 1; start <= 10; start++) {
      boolean prime = isprime(start);

      if (prime) {
        System.out.println(start);
      }
    }
  }

  public static boolean isprime(int number) {
    int den = 2;
    for (; den < number; den++) {
      if (number % den == 0) {
        return false;
      }
    }
    return true;
  }
}

public class recursivePrime {
  public static void main(String[] args) {
System.out.println(isprime(7, 2));
  }

  public static boolean isprime(int num, int den) {
    if (num == den) {
      return true;
    } else if (num % den == 0) {
      return false;
    }

    return isprime(num, ++den);
  }
}

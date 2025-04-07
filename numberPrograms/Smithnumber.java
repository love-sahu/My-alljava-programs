public class Smithnumber {

  public static void main(String[] args) {
    smith(124);
  }

  public static boolean smith(int n) {
    //!ye hua ni hy
  }

  public static int nextPrime(int num) {
    while (!isprime(num)) {
      num++;
    }
    return num;
  }

  public static boolean isprime(int num) {

    for (int i = 2; i < num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static int sumOfDigit(int num) {
    int sum = 0;
    while (num != 0) {
      sum += num % 10;
      num /= 10;
    }
    return sum;
  }
}
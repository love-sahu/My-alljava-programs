public class RotatingPrimeNumber {
  public static void main(String args[]) {
    System.out.print(RotatingPrimeNumber(991 ));
  //   for(int i=0;i<=1000;i++){
  //     if(RotatingPrimeNumber(i)){
  //       System.out.println(i);
  //     }
  // }
  }
  public static boolean RotatingPrimeNumber(int num) {
    if (isPrime(num)) {

      int rot = rotate(num);
      while (num != rot && isPrime(rot)) {
        rot = rotate(rot);
      }
      return num == rot;
    }
    return false;
  }

  public static int rotate(int num) {
    int last = num % 10;
    num /= 10;
    int ct = count(num);
    return last * power(10, ct) + num;
  }

  public static int count(int num) {
    int ct = 0;
    while (num != 0) {
      num /= 10;
      ct++;
    }
    return ct;
  }

  public static int power(int digit, int count) {
    int power = 1;
    for (int i = 1; i <= count; i++) {
      power *= digit;
    }
    return power;
  }

  public static boolean isPrime(int n) {

    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
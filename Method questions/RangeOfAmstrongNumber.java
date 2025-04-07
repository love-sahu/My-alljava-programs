public class RangeOfAmstrongNumber {
  public static void main(String[] args) {
    // 145
    // length=3
    // 1*1*1+4*4*4+5*5*5 == original number hance it is amstrong number
    for (int i = 1; i <= 1000; i++) {
      if (isamstrong(i)) {
        System.out.println(i);
      }
    }
  }

  public static boolean isamstrong(int num) {
    int ct = count(num);
    int sum = 0;
    for (int i = num; i > 0; i /= 10) {
      int last = i % 10;
      sum += power(last, ct);
    }
    return num == sum;
  }

  public static int count(int num) { // 153
    int ct = 0;
    while (num != 0) {
      num /= 10;

      ct++;
    }
    return ct;
  }

  public static int power(int digit, int ct) {
    int power = 1;
    for (int i = 1; i <= ct; i++) {
      power *= digit;
    }
    return power;
  }
}

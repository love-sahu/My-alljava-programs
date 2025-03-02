public class RangeOfAmstrongNumber {
  public static void main(String[] args) {
    // count
    // 124==1*3+2*3+4*3
    // System.out.println(isamstrong(153));

    for (int i = 1; i <= 500; i++) {
      if (isamstrong(i)) {
        System.out.println(i);
      }
    }
  }

  public static boolean isamstrong(int num) {
    int ct = count(num);
    int sum = 0;
    for (int i = num; i > 0; i /= 10) {
      int rem = i % 10;

      sum = sum + power(rem, ct);

    }
    // System.out.println(sum);
    return num == sum;
  }

  public static int count(int num) {
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


public class RangeOfHappyNumbers {
  public static void main(String[] args) {
    // System.out.print(isHappy(9));
    for (int i = 1; i <= 100000; i++) {
      if (isHappy(i)) {
        System.out.println(i);
      }
    }
  }

  /// happy number means the number which 9^2=81=8^2+1^2
  public static boolean isHappy(int num) {
    int sum = sumOfIndiDigits(num);
    while (sum != 4 && sum != 1) {
      sum = sumOfIndiDigits(sum);
    }
    return sum == 1;
  }

  public static int sumOfIndiDigits(int num) {
    int sum = 0;
    while (num != 0) {

      sum += num % 10 * num % 10;
      num /= 10;
    }
    return sum;
  }
}

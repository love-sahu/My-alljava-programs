public class RotationOfRotateNumber {

  public static void main(String args[]) {
    // iterations
    int input = 12345;
    int rotate = Rotate(input);

    do {
      System.out.println(rotate);
      rotate = Rotate(rotate);
    } while (rotate != input);
    System.out.println(rotate);

  }

  // 145 ==rotate ==>514
  public static int Rotate(int num) {
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

  public static int power(int digit, int ct) {
    int power = 1;
    for (int i = 1; i <= ct; i++) {
      power *= digit;
    }
    return power;
  }
}

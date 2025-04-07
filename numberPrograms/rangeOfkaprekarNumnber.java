public class rangeOfkaprekarNumnber {

  public static void main(String args[]) {
    // System.out.println(isKaprekar(2915422));
    for(int i=1;i<100000;i++){
      if(isKaprekar(i)){
        System.out.println(i);
      }
    }
  }

  public static boolean isKaprekar(int num) {
    long sqrt = num * num; // 1245 100 2222
    int count = count(sqrt);
    int power = power(10, count - 1);
    while (power > 0) {
      if ((sqrt / power) + (sqrt % power) == num) {
        return true;
      }
      power /= 10;
    }
    return false;
  }

  public static int power(int n, int ct) {
    int pow = 1;
    for (int i = 1; i <= ct; i++) {
      pow *= n;
    }
    return pow;
  }

  public static int count(long num) {
    int ct = 0;
    while (num != 0) {
      num /= 10;
      ct++;
    }
    return ct;
  }

}

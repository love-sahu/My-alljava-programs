public class rangeOfautobiographicNUmber {

  public static void main(String[] args) {
    // System.out.println(idautobiography(2));
    for (int i = 1; i <= 100000000; i++) {
      if (idautobiography(i)) {
        System.out.println(i);
      }
    }
  }

  public static boolean idautobiography(int num) {
    int n1 = num / power(10, count(num) - 1);
    String str = Integer.toString(num); // 1210

    boolean flag = false;
    for (int i = 0; i < str.length(); i++) {

      if (Character.getNumericValue(str.charAt(i)) == count(num, i)) {
        flag = true;
      } else {
        return false;
      }
    }
    return flag;
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

  public static int count(int num, int n) {

    int count = 0;
    while (num != 0) {
      int last = num % 10;
      if (last == n) {
        count++;
      }
      num /= 10;
    }
    return count;
  }
}

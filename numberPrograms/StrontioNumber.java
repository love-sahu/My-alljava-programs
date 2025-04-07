public class StrontioNumber {
  public static void main(String args[]) {
    System.out.println(strontioNumber(2002));
  }

  public static boolean strontioNumber(int n) {
    int temp = n * 2; // 1221
    temp /= 10;
    int last = temp % 10;
    temp /= 10;
    if (last == temp % 10) {
      return true;
    }
    return false;

  }
}

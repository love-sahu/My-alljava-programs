public class power {
  public static void main(String args[]) {
    System.out.println(po(2, 5));
  }// 4^5=4*4*4*4*4

  public static int po(int base, int rise) {
    if (rise == 0) {
      return 1;
    }
    return base * po(base, rise - 1);
  }
}

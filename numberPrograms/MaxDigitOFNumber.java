public class MaxDigitOFNumber {
  public static void main(String args[]) {
    int number = 1245126;
    int max = Integer.MIN_VALUE;
    for (int i = number; i > 0; i /= 10) {
      int ren = i % 10;
      if (max < ren) {
        max = ren;
      }
    }
    System.out.print(max + "is max digit of number :" + number);
  }
}

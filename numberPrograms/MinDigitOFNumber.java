public class MinDigitOFNumber {
  public static void main(String args[]) {
    int number = 1245126;
    int min = Integer.MAX_VALUE;
    for (int i = number; i > 0; i /= 10) {
      int ren = i % 10;
      if (min > ren) {
        min = ren;
      }
    }
    System.out.print(min + ":is min digit of number :" + number);
  }
}

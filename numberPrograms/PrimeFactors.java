public class PrimeFactors {
  public static void main(String[] args) {
    int number = 1245113;
    for (int i = 0; i <= 9; i++) {
      int count = 0;
      for (int j = number; j > 0; j /= 10) {
        int rem = j % 10;
        if (i == rem) {
          count++;
        }
      }

      if (count != 0) {
        System.out.println(i + ":" + count);
      }
    }
  }
}

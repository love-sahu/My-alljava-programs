import java.util.Scanner;

public class HeighestRepeativeNumber {
  public static void main(String[] args) {

    // Scanner sc = new Scanner(System.in);
    int num = 123555211;
    int max = Integer.MIN_VALUE;
    int digit = 0;
    for (int i = 0; i <= 9; i++) {
      int count = 0;
      for (int j = num; j > 0; j /= 10) {
        int rem = j % 10;
        if (i == rem) {
          count++;
        }
        if (max < count) {
          max = count;
          digit = i;
        }
      }
    }
    System.out.println(digit + ":" + max);

  }
}
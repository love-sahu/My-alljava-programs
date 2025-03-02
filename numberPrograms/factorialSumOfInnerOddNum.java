public class factorialSumOfInnerOddNum {
  public static void main(String[] args) {

    int num = 145;

    int sum = 0;
    while (num > 0) {
      int rem = num % 10;
      if (rem % 2 == 0) {
        int fact = 1;
        for (int i = rem; i >= 1; i--) {

          fact = fact * i;
        }
        sum += fact;
      }
      num = num / 10;
    }
    System.out.println(sum);
  }
}

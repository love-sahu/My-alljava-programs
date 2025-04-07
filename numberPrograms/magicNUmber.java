public class magicNUmber {
  public static void main(String[] args) {

    // System.out.println(sumOfDigit(1234));
    System.out.println(sumOfDigit(1234)?"magical num":"not magical");
  }

  public static boolean sumOfDigit(int n) {
    int sum = 0;
    while (n != 0) {
      sum += n % 10;
      n /= 10;
    }
  if (sum > 9) {
      return sumOfDigit(sum);
    }
    return sum==1 ;
  }
}

public class amicableNumber {
  public static void main(String[] args) {
    // System.out.println(amicableNumber(220, 284));
    int j=1;
for(int i=1;i<1000;i++){

}
  }

  public static boolean amicableNumber(int num, int num2) {
    int n1 = factor(num);
    int n2 = factor(num2);
    if (n1 == num2 && n2 == num) {
      return true;
    }
    return false;
  }

  public static int factor(int num) {
    int sum = 0;
    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        sum += i;
      }
    }
    return sum;
  }
}

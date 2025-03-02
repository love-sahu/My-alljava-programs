public class krishnumber {
  public static void main(String[] args) {
    int number = 145, dup = number;
    int sum = 0;
    for (int i = number; i > 0; i /= 10) {
      int rem = number % 10;
      int fac = 1;
      for (int j = 1; j <= rem; j++) {
        fac = fac * j;

      }
      number /= 10;
      // System.out.println(fac);
      sum += fac;

    }
    System.out.println(sum);
    System.out.println((sum == dup ? dup + " is krishnmorthy" : dup + " is not krishnmorthy"));

  }
}

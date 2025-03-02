public class maxDIgitNum {
  public static void main(String[] args) {
    int num = 12345;
    int num2 = num;
    int max = Integer.MIN_VALUE;
    for (int i = num; i > 0; i /= 10) {
      int rem = num % 10;
      if (max < rem) {
        max = rem;
      }
    }
    System.out.println(max);

  }
}

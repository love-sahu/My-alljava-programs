public class ISBN_Number {
  public static void main(String[] args) {
    long number = 1259060977l;
    long sum = 0l;
    for (long i = number, j = 1; i > 0; i /= 10, j++) {
      long rem = i % 10;
      sum += rem * j;
    }
    System.out.println(sum);
    System.out.println(sum % 11 == 0 ? "ISBN number " : "not ISBN number");
  }
}

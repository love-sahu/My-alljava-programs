public class product_UsingWhile {
  public static void main(String[] args) {
    int num = 222;
    int product = 1;
    while (num > 0) {
      int rem = num % 10;
      product *= rem;
      num /= 10;
    }
    System.out.print(product);
  }
}

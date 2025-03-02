public class powerOfnNumber {
  public static void main(String[] args) {
    int base_number = 5;
    int exponent_num = 4;
    int power = 1;
    for (int i = 1; i <= exponent_num; i++) {
      power *= base_number;
    }
    System.out.println(base_number + "^" + exponent_num + "is :" + power);
  }
}

public class xylem {
  public static void main(String[] args) {
    System.out.println(xylem(271389));
  }

  public static String xylem(int num) {
    int last = num % 10;
    num /= 10;
    int sum = 0;

    while (num > 9) {
      sum += num % 10;
      num /= 10;
    }
    last += num % 10;
    return sum == last ? "xylem" : "phloem";
  }
}

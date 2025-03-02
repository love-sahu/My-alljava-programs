public class factorial {

  public static void main(String[] args) {

    int num = 4;
    int sum = 1;
    for (int i = 1; i <= num; i++) {
      sum = sum * i;
    }
    System.out.println("factorial is: " + sum);

    // for (int i = 4; i >= 1; i--) {
    // sum = sum * i;
    // }
    // System.out.println("factorial is: " + sum);

  }
}
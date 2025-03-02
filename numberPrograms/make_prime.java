import java.util.Scanner;

class make_prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);// 12 ==not prime
    int num = sc.nextInt();
    // boolean flag = false;
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        num++;
        i = 2;
      }
    }
    System.out.println("generated prime number is:" + num);

  }
}
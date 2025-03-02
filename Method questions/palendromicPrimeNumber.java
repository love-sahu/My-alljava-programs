import java.util.Scanner;

public class palendromicPrimeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your number for cheaking palendromic prime number");

    int input = sc.nextInt();
    boolean cheakPrime = isPrime(input);
    // System.out.println(cheakPrime + ": prime or not"); /// prime or not

    int rev = reverse(input);
    // System.out.println(rev + ":reverse of" + input); // cheak number palendrome
    // && operator for cheak both are true if one false it will give op as false
    if (isPrime(input) && rev == input) {
      System.out.println("palendromic prime number");
    } else {
      System.out.println("not palendromic prime number");
    }
  }

  public static int reverse(int num) {
    int rev1 = 0;
    for (int i = num; i > 0; i /= 10) {
      rev1 = rev1 * 10 + (i % 10);
    }
    return rev1;
  }

  public static boolean isPrime(int num) {
    int den = 2;
    for (; den < num; den++) {
      if (num % den == 0) {
        break;
      }
    }
    return num == den;
  }
}

public class SphenicNumber {
  public static void main(String[] args) {
    System.out.println(sphonicnum(42));
    // System.out.println(nextPrime());
  }

  public static boolean sphonicnum(int n) { // spnonic number= 30====>2*3*5
    int n1 = 2;
    int n2 = 3;
    int n3 = 5;
    while (true) {
      if (n1 * n2 * n3 == n) {
        return true;
      }
      n1 = nextPrime(n1);
      n2 = nextPrime(n2);
      n3 = nextPrime(n3);
    }
  }

  public static int nextPrime(int num) {
    num += 1;
    while (!isprime(num)) {
      num++;
    }
    return num;
  }

  public static boolean isprime(int n) {
    int i = 2;
    while (i < n) {
      if (n % i == 0) {
        return false;
      }
      i++;
    }

    return true;
  }

}
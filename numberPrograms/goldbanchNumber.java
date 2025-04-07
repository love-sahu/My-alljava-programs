public class goldbanchNumber {

  public static void main(String[] args) {
    System.out.println(goldbanch(122));
  }

  public static boolean goldbanch(int num) {
    int pprime = pprime(num); // 47=>43
    int nprime = nextPrine(2);// 2 43+5=>48
    while (nprime < pprime) {
      if (pprime + nprime == num) {
        //
        return true;
      } else if (pprime + nprime < num) {
        nprime = nextPrine(nprime);

      } else {
        pprime = pprime(pprime);
      }
    }

    return false;
  }

  public static int nextPrine(int num) {
    num += 1;
    while (!isprime(num)) {
      num++;
    }
    return num;
  }

  public static int pprime(int num) {
    num -= 1;
    while (!isprime(num)) {
      num--;
    }
    return num;
  }

  public static boolean isprime(int num) {

    for (int i = 2; i < num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
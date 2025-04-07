public class twinPrimenumber {
  public static void main(String[] args) {
    System.out.println(istwinPrime(17, 19));
    
  }

  public static boolean istwinPrime(int num1, int num2) {
    int dif=0;
      if(isprime(num1) && isprime(num2)){
        dif=num2-num1;
      }
      return dif==2;
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

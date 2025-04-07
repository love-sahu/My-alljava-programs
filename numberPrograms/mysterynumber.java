public class mysterynumber {
  public static void main(String args[]) {
  //  System.out.println( mysterynum(11));
  for(int i=1;i<=1000;i++){
    if(mysterynum(i)){
      System.out.println(i);
    }
  }
  }

  public static int rev(int num) {
    int rev = 0;
    while (num != 0) {
      rev =rev*10+ num % 10;
      num /= 10;
    }
    return rev;
  }

  public static boolean mysterynum(int num) {
    for (int i = 1; i <= num; i++) {// 92+29==121
      if ((i + rev(i)) == num) {
        System.out.println(i+" "+rev(i)+"="+num);
        return true;
      }
    }
  return false;
  }
}

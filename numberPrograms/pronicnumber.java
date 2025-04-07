public class pronicnumber {
  public static void main(String[] args) {
    System.out.println(ispronic(12));
  }

  public static boolean ispronic(int num) {
    for (int i = 1;; i++) {
      if (i * (i + 1) == num) {
        number(i, i + 1,num);
        return true;
      } else if (i * (i + 1) > num) {
        return false;
      }
    }
  }

  public static void number(int n, int n1,int num) {
    System.out.println(n+"*"+n1+"="+num);
  }
}

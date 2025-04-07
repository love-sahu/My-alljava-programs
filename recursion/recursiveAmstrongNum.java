public class recursiveAmstrongNum {
  public static void main(String[] args) {
    System.out.println(isAmstrongNum(153, 153, 0));
   // System.out.println(power(3, 3)); // ! rong power likhna hy acche se
  }

  public static boolean isAmstrongNum(int num, int temp, int sum) {
    if (num == 0) {
      return temp==sum ;
    } 
      int cnt = count(temp, 0) ;
      int last = num % 10;
  
      sum += power(last, cnt);
     
      return isAmstrongNum(num/10, temp, sum);
      
    
  }

  public static int count(int num, int ct) {
    if (num == 0) {
      return ct;
    } else {

      return count(num / 10, ++ct);

    }
  }

  public static int power(int digit, int ct) {
    if (ct == 0) {
      return 1;
    }
      
      
      return digit*power(digit, --ct);
    
  }
}

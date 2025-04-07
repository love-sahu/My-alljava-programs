public class recursiveSumOfDigit {
  public static void main(String[] args) {
   System.out.println( sumOfDigit(11111, 0));
  }
  public static int sumOfDigit(int num, int sum){
    if(num==0){
      return sum;
    }
    else{
       sum+=num%10;
     return  sumOfDigit(num/10,sum);
    }
  }
}

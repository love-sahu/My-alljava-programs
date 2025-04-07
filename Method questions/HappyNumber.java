// public class HappyNumber {
//   public static void main(String []args){
//     System.out.print(isHappy(9));
//   }
//   ///happy number means the number which 9^2=81=8^2+1^2 
//   public static boolean isHappy(int num){
//     int sum=sumOfIndiDigits( num);
//     while(sum!=4 && sum!=1){
//       sum=sumOfIndiDigits(sum);
//     }
//     return sum==1;
//   }
// public static int sumOfIndiDigits(int num){
//   int sum=0;
//     while(num!=0){

//       sum+=num%10*num%10;
//       num/=10;
//     }
//     return sum;
// }
// }

class HappyNumber {
  public static void main(String[] args) {
    System.out.println(isHappy(19));
  }

  public static boolean isHappy(int n) {
    int sum = sumOfDigit(n);
    while (sum != 1 && sum != 4) {
      sum = sumOfDigit(sum);
    }
    return sum == 1;
  }

  public static int sumOfDigit(int n) {
    int sum = 0;
    for (int i = n; i > 0; i /= 10) {
      // int last=i%10;
      sum += ((i % 10) *( i % 10));
      // sum += (last * last);
    }

    return sum;
  }
}
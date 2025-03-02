public class Countnumber {
  public static void main(String[] args) {

    int num = 999;
    int newnum = num;
    int sum = 0;

    int rem = num % 10; // 222%10=2
    sum = sum + rem;// 0+2=2

    num = num / 10;// 222/10=22
    rem = num % 10; // 22%10=2
    sum = sum + rem;

    num = num / 10;// 22/10=2
    rem = num % 10;// 2%10=2
    sum = sum + rem;

    System.out.print("sum of all number is " + sum);
  }
}
public class ProductOfNum {

  public static void main(String[] args) {
    int num = 222;
    int newnum = num;
    int productOfNum = 1;

    int rem = num % 10; // 222%10=2
    productOfNum = productOfNum * rem;// 0+2=2

    num = num / 10;// 222/10=22
    rem = num % 10; // 22%10=2
    productOfNum = productOfNum * rem;

    num = num / 10;// 22/10=2
    rem = num % 10;// 2%10=2
    productOfNum = productOfNum * rem;

    System.out.println(productOfNum);
  }
}

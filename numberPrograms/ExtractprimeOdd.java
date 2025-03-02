public class ExtractprimeOdd {

  public static void main(String[] args) {

    int num = 4895;
    int newnum = num;
    int oddsum = 0;
    int evensum = 0;
    int sum = 0;
    int rem = num % 10; // 222%10=2
    sum = (rem % 2 == 0) ? (evensum = evensum + rem) : (oddsum = oddsum + rem);// 0+2=2

    num = num / 10;// 222/10=22
    rem = num % 10; // 22%10=2
    sum = (rem % 2 == 0) ? (evensum = evensum + rem) : (oddsum = oddsum + rem);// 0+2=2

    num = num / 10;// 22/10=2
    rem = num % 10;// 2%10=2
    sum = (rem % 2 == 0) ? (evensum = evensum + rem) : (oddsum = oddsum + rem);// 0+2=2
    num = num / 10;// 22/10=2
    rem = num % 10;// 2%10=2
    sum = (rem % 2 == 0) ? (evensum = evensum + rem) : (oddsum = oddsum + rem);// 0+2=2

    System.out.println("even " + evensum);
    System.out.println("odd   " + oddsum);

  }

}

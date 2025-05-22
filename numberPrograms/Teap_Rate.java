import java.util.Scanner;

public class Teap_Rate {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter ypur bill");
    float bill = sc.nextFloat();
    System.out.println("enter tip rate");
    float tipRate = sc.nextFloat();
    float tipAmmount = (bill * tipRate) / 100;
    System.out.println(tipAmmount);
    float TotalBill = bill + tipAmmount;
    System.out.println("your total bill is" + TotalBill);
  }
}

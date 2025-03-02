import java.util.Scanner;

public class CurrencyCalculator {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("enter your money in INR :");
    Float indCurrency = sc.nextFloat();

    System.out.println("choose from list");
    System.out.println("USD");
    System.out.println("EUR");
    System.out.println("GBP");
    System.out.println("CAD");
    System.out.print("enter currency name for converting:");
    String currencyName = sc.next().toUpperCase();

    float newcurr = 0;

    if (currencyName.equals("USD")) {
      newcurr = (indCurrency / 86.58f);
      System.out.println(indCurrency + "(IND) =" + newcurr + "UDS");
    } else if (currencyName.equals("EUR")) {
      newcurr = (indCurrency / 90.28f);
      System.out.println(indCurrency + "(IND) =" + newcurr + "EUR");
    } else if (currencyName.equals("GBP")) {
      newcurr = (indCurrency / 107.28f);
      System.out.println(indCurrency + "(IND) =" + newcurr + "GBP");
    } else if (currencyName.equals("CAD")) {
      newcurr = (indCurrency / 60.10f);
      System.out.println(indCurrency + "(IND) =" + newcurr + "CAD");
    } else {
      System.out.println("envalid input");
    }

  }
}
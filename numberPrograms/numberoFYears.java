import java.util.Scanner;

public class numberoFYears {
  public static void main(String[] args) {
    int minuts = new Scanner(System.in).nextInt();
    int minutofyear = (365 * 24 * 60);
    int numberoFYears = minuts / minutofyear;
    int remainingMinutes = minuts % minutofyear;
    int days = remainingMinutes / (24 * 60);
    System.out.println(minuts + " is aproximately " + numberoFYears + " years and " + days + " days");
  }
}

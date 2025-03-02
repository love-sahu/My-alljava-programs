public class Busnumber {
  public static void main(String[] args) {
    int number = 72;
    if (number % 7 == 0) {
      System.out.println(
          number + " is buzz number");
    } else {
      if (number % 10 == 7) {
        System.out.println(number + " :is buzz number last digit is 7");
      } else {
        System.out.println(number + " : is not buzz number");
      }
    }
  }
}

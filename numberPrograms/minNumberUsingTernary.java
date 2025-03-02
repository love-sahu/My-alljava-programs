public class minNumberUsingTernary {
  public static void main(String[] args) {
    int num = 235;
    int sumodd = 0;
    int sumprime = 0;
    int temp;

    int rem = num % 10;// 235%10=5
    temp = (rem % 2 == 0) ? (sumodd = sumodd + rem) : (sumprime = sumprime + rem);

    num = num / 10; // 235/10=23
    rem = num % 10; // 23%10=3
    temp = (rem % 2 == 0) ? (sumodd = sumodd + rem) : (sumprime = sumprime + rem);

    num = num / 10; // 235/10=23
    rem = num % 10; // 23%10=3
    temp = (rem % 2 == 0) ? (sumodd = sumodd + rem) : (sumprime = sumprime + rem);

    System.out.println(sumodd);
    System.out.println(sumprime);
  }
}

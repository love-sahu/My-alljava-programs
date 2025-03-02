public class largeusingternary {
  public static void main(String[] args) {
    int n1 = 5;
    int n2 = 9;
    int n3 = 6;

    int temp = (n1 > n2) ? ((n1 > n3) ? (n1) : (n3)) : ((n2 > n3) ? (n2) : (n3));
    System.out.println(temp);

  }
}

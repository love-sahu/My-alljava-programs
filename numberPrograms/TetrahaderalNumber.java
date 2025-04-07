public class TetrahaderalNumber {
  public static void main(String[] args) {
    System.out.println(Tetrahaderal(3));
  }
  public static int Tetrahaderal(int n){
    return (n*(n+1)*(n+2))/6;
  }
}

public class lazyNUmber {
  public static void main(String[] args) {
    System.out.println(lazyNUmber(5));
  }
  public static int lazyNUmber(int n){
    return ((n*(n+1))/2)+1; 
  }
}

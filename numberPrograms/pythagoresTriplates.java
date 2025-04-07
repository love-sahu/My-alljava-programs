public class pythagoresTriplates {
  public static void main(String args[]) {

    int n = 55;

    int x1, x2, x3;
    for (int a = 1; a <= n; a++) {
      for (int b = 1; b <= n; b++) {
        for (int c = 1; c <= n; c++) {
          x1 = a;
          x2 = b;
          x3 = c;
          if (Math.sqrt(a) + Math.sqrt(b) == Math.sqrt(c)) {
           if(a<b) System.err.println(x1 + " " + x2 + " " + x3);
          //  System.out.println();
          }
          
        }
      }

    }
  }
}

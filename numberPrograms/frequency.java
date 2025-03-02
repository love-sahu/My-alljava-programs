public class frequency {
  public static void main(String[] args) {
    int num = 12341256;
    for (int i = 1; i <= 9; i++) {
      int count = 0;
      for (int j = num; j > 0; j /= 10) {

        int rem = j % 10;
        if (rem == i) {
          count++;
        }
      }

      if (count != 0) {
        System.out.println(i + ":" + count);
      }
    }
  }
}

public class recursiveCount {
  public static void main(String args[]) {
    System.out.print(count(145, 0));
  }

  public static int count(int num, int ct) {
    if (num == 0) {
      return ct;
    } else {
      // ct++;
      return count(num / 10, ++ct);
    }

    // ! in one line finding count
    // return num==0?ct:count(num/10,++ct);
  }
}

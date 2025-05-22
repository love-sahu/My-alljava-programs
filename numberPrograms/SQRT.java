public class SQRT {
  public static void main(String[] args) {
    int num = 49;
    boolean flag = false;
    for (int i = 1; i <= num; i++) {
      if (i * i == num) {
        flag = true;
        System.out.print("perfect square is:" + i);
      }
      if (i * i > num) {
        break;
      }
    }
    if (flag == false) {
      System.out.print("dont have perfect sqr");
    }
  }
}

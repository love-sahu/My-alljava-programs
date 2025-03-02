public class FascinatingNum {
  public static void main(String[] args) {
    int number = 192;
    String str = (number) + "" + (number * 2) + "" + (number * 3);
    System.out.println(str);
    boolean flag = true;
    for (char ch = '1'; ch <= '9'; ch++) {
      int count = 0;
      for (int i = 0; i < str.length(); i++) {
        if (ch == str.charAt(i)) {
          count++;
        }
      }
      if (count != 1) {
        flag = false;
        break;
      }
    }

    if (flag) {
      System.out.println(number + "f number");
    } else {
      System.out.println("not f number");
    }
  }
}

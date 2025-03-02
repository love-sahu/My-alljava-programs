public class Automorphicnumber {
  public static void main(String[] args) {
    int num = 24;
    int length = 0;
    int div = 1;
    for (int i = num; i > 0; i /= 10) {
      length++;
    }
    for (int i = 1; i <= length; i++) {
      div *= 10;
    }
    if (num == (num * num) % div) {
      System.out.println(num + " :is automorphic number");
    } else {
      System.out.println(num + " :is not automorphic number");
    }
  }
}

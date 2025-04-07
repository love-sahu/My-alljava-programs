public class StaticBlock {
  static {
    test();
  }

  public static void main(String[] args) {
    System.out.println("from main ex2");
  }

  public static void test() {
    System.out.println("from Static test ex1");
  }
}

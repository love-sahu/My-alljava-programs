public class callfromStatic {
  public void xyz() {

    abc();
    System.out.println("from non static zyz");
    staticmethod();
  }

  public void abc() {
    System.out.println("from non static abc");
  }

  public static void staticmethod() {
    
    System.out.println("from static context");

  }

  public static void main(String[] args) {
    callfromStatic m1 = new callfromStatic();
    m1.xyz();
  }
}
public class staticPiValue {
  static double pi = 22.0 / 7.0;

  public static void main(String args[]) {
    areaOfCircle(10);
    circumferenceOfcircle(10);
  }

  public static void areaOfCircle(int r) {
    double area = pi * (r * r);
    System.out.println(area);
  }

  public static void circumferenceOfcircle(int r) {
    double area = 2 * pi * r;
    System.out.println(area);
  }
}

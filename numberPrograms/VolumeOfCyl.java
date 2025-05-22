import java.util.Scanner;

public class VolumeOfCyl {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    float radius = s.nextFloat();
    int height = s.nextInt();
    float pi = 22f / 7f;
    float area = pi * (radius * radius);
    float volumee = area * height;
    System.out.println("area of cylender is " + area);
    System.out.println("volume of cylender is " + volumee);
  }
}

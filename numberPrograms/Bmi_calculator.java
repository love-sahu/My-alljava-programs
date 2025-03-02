import java.util.Scanner;

public class Bmi_calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter weight in kilogram");
    float weight = sc.nextFloat();
    double weight_kilogram = weight * 0.45359237;
    System.out.println("enter in inches");
    float height = sc.nextFloat();
    double height_inmeters = height * 0.0254;
    float health = (float) (weight_kilogram / (height_inmeters * height_inmeters));

    System.out.print("the body mass index is" + health);

    /// ans is 26.857258
  }
}

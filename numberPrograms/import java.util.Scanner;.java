import java.util.Scanner;

class marks_CalculateUsingTurnery {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    float marks = sc.nextFloat();

    // float total_marks = 600;
    float percentage = ((marks / 600) * 100);
    System.out.println(percentage);

    String grade = (marks >= 600 || marks < 0) ? ("envalid marks entered")
        : (percentage > 70 && percentage < 80) ? ("C")
            : (percentage >= 80 && percentage < 90) ? ("B")
                : (percentage >= 90 && percentage <= 100) ? ("A")
                    : ("envalid");

    System.out.println(grade);
  }
}
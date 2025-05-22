import java.util.*;

class circlekaarea {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int dimeter = sc.nextInt();
		float r = (float) dimeter / 2;
		float pi = 3.14f;
		float areaOfCircle = pi * r * r;
		System.out.print(String.format("%.2f",areaOfCircle));
	}
}
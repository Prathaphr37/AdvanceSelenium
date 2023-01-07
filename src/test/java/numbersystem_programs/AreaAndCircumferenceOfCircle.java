package numbersystem_programs;

import java.util.Scanner;

public class AreaAndCircumferenceOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radious of circle");
		int radious = sc.nextInt();

		double area = 3.142 * radious * radious;
		double circumference = 2 * 3.142 * radious;
		System.out.println("area = " + area);
		System.out.println("circumference = "+circumference);
	}
}

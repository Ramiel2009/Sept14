package ua.mm.figures;

import java.util.Scanner;

public class Triangle {
	static double length1;
	static double length2;
	static double length3;
	static double angle;
	static double area;
	static double perimeter;
	static int colorId;
	static String color;

	public static void setTriangle() {
		Color colorId = new Color();
		String[] color = { "White", "Black", "Brown", "Green", "Yellow",
				"Grey", "Red", "Blue", "Orange", "Pink" };
		System.out.println(color[colorId.setColor() - 1]);
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n\nPlease select the length of the 1st side:");
		length1 = scanner.nextInt();
		System.out.println("Please select the length of the 2nd side:");
		length2 = scanner.nextInt();
		System.out.println("Select the angle between two sides");
		angle = scanner.nextInt();
		area = (int) ((length1 * length2 * Math.sin(angle)) / 2);
		//System.out.println("\nThe area of your triangle is: " + area);
		length3 =  Math.sqrt((Math.pow(length1, 2)
				+ (Math.pow(length2, 2)) - 2 * (length1 * length2 * Math.cos(Math.toRadians(angle)))));
		perimeter = length1 + length2 + length3;
	}
	public static void getInfo(){
		System.out.println("TRIANGLE INFO:\n" +
				"1st side length = "+length1+"; 2nd side length = "+length2+"; 3rd side length = " +length3+ ";\nArea = "+area+"(²)"+"; Perimeter = "+perimeter+";");
	}
}

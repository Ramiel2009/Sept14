package ua.mm.figures;

import java.util.Scanner;

public class Square {
	static int length;	
	static int area;
	static int perimeter;
	
	public static void setSquare(){
		Color colorId = new Color();
		String[] color = { "White", "Black", "Brown", "Green", "Yellow",
				"Grey", "Red", "Blue", "Orange", "Pink" };
		System.out.println(color[colorId.setColor() - 1]);
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n\nPlease select the length of the side:");
		length = scanner.nextInt();
		area = (int) Math.pow(length, 2);
		perimeter = length*4;
	}
	
	public static void getInfo(){
		System.out.println("SQUARE INFO: \n" +
				"Sides length = "+length+"; Area = "+area+"(²)"+"; Perrimeter = "+perimeter);
	}
}

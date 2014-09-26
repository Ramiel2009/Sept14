package ua.mm.figures;

import java.util.Scanner;

public class Square {
	int length;	
	int area;
	int perimeter;
	
	public void setSquare(){
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
	
	public void getInfo(){
		System.out.println("SQUARE INFO: \n" +
				"Sides length = "+length+"; Area = "+area+"(²)"+"; Perrimeter = "+perimeter);
	}
}

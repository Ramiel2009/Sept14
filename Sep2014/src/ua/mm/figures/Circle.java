package ua.mm.figures;

import java.util.Scanner;

public class Circle {
	
	static int radius;
	static int length;
	static int area;
	
	public void setCircle() {
		Color colorId = new Color();
		String[] color = { "White", "Black", "Brown", "Green", "Yellow",
				"Grey", "Red", "Blue", "Orange", "Pink" };
		System.out.println(color[colorId.setColor() - 1]);
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n\nPlease select the radius of your circle:");
		radius = scanner.nextInt();
		length =(int) (2 * (Math.PI*radius));
		area = (int) (Math.PI*Math.pow(radius, 2));
	}
	public void getInfo(){
		System.out.println("CIRCLE INFO:\n" +
				"Radius = "+radius+"; Diameter = "+radius*2+"; Area = "+area+"(²)"+"; Length = "+length);
	}
}

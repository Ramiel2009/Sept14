package ua.mm.figures;

import java.util.Scanner;

public class Color {
	int colorId;
	String color;

	public int setColor(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nSelect color ID from the table below : \n--------------------------" +
				"\n|	0 - Random       |"+
				"\n| 1 - White  | 2 - Black |\n| 3 - Brown  | 4 - Green |" +
				"\n| 5 - Yellow | 6 - Grey  |\n| 7 - Red    | 8 - Blue  |\n| 9 - Orange | 10 - Pink |" +
				"\n--------------------------");
		colorId = scanner.nextInt();
		if (colorId == 0){
			colorId = (int) ((Math.random()*10));
		}
		return colorId;
	}
	public String getColor(){
		switch (colorId){
		case 0:
			color = "White";
			break;
		case 1:
			color = "Black";
			break;
		case 2:
			color = "Brown";
			break;
		case 3:
			color = "Green";
			break;
		case 4:
			color = "Yellow";
			break;
		case 5:
			color = "Grey";
			break;
		case 6:
			color = "Red";
			break;
		case 7:
			color = "Blue";
			break;
		case 8:
			color = "Orange";
			break;
		case 9:
			color = "Pink";
			break;	
				}
		return color;
	}
}

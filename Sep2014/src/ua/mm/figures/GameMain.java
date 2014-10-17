package ua.mm.figures;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		boolean flag = false;
		String figureId;
		do {
			System.out.println("Select your figure:\n"+ "1 - Triangle; 2 - Square; 3 - Circle; Any other key = exit");
			Scanner scanner = new Scanner(System.in);
			figureId = scanner.nextLine();
			switch (figureId) {
			case "1":
				Triangle.setTriangle();
				Triangle.getInfo();
				break;
			case "2":
				Square.setSquare();
				Square.getInfo();
				break;
			case "3":
				Circle circle = new Circle();
				circle.setCircle();
				circle.getInfo();
				break;
			default:
				flag = true;
				break;
			}
		} while (flag != true);
	}
}

package ua.mm.figures;

import java.util.Scanner;

//Создать три класса - круг, квадрат, треугольник. Каждый класс должен содержать информацию о том,
//1. какая он фигура,
//2. Цвет - отдельным классом, рандомно 1 из 10 цветов
//3. Периметр 
//4. Площадь. 
//Метод сетСквер, сетКолор, сетПлощадь, гет инфо. 

public class GameMain {

	public static void main(String[] args) {
		int figureId;
		System.out.println("Select your figure:\n" +
				"1 - Triangle; 2 - Squere; 3 - Circle;");
		Scanner scanner = new Scanner(System.in);
		figureId = scanner.nextInt();
		switch (figureId) {
		default:
			break;
		case 1:
			Triangle triangle = new Triangle();
			triangle.setTriangle();
			triangle.getInfo();
			break;
		case 2:
			Square square = new Square();
			square.setSquare();
			square.getInfo();
			break;
	
		case 3: 
			Circle circle = new Circle();
			circle.setCircle();
			circle.getInfo();
			break;
		}
	}
}

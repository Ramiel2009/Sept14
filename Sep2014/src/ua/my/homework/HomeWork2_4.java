package ua.my.homework;

import java.util.Scanner;

public class HomeWork2_4 {

	// вводится число, вывести четное оно или нет
	public static void main(String[] args) {

		boolean check = true;
		while (check == true) {
			
			Scanner in = new Scanner(System.in);
			int n;
			System.out.println("Enter the number");
			
			if ( in.hasNextInt()){
				n = in.nextInt();
			if ((int)n%2==0) {
				System.out.println("четное");
				check = false;
			} else
				System.out.println("не четное!");
			check=false;}
			else
			System.out.println("Введено не целое число, введите число типа int!");	
		}
	}
}

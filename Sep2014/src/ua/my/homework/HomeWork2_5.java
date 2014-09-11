package ua.my.homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork2_5 {

	// вводится латинская буква - гласная она или согласная

	public static void main(String[] args) {
		String a[] = { "a", "e", "i", "o", "u" };

		System.out.println(Arrays.toString(a));
		String c;
	
		System.out.println("Enter any latin letter");
		
		boolean flag = true;
		while (flag == true) {	
			Scanner in = new Scanner(System.in);
			c = in.nextLine();
			for (int i = 0; i < a.length; i++) {
				
				if (c == a[i]){
				System.out.println(Arrays.toString(a));
				flag = false;
				
				
			}

		}
	}
}
package ua.my.homework;

import java.util.Arrays;

//ДЗ: отсортировать массив пузырьковым методом


public class HomeWork2_1 {

	public static void main(String[] args) {

		int[] m = { 11, 13, 19, 15, 16, 12, 18, 14, 17, 10 };
		int swaper;
		for (int a = 0; a < m.length - 1; a++) { 

			for (int i = 0; i < m.length - 1 - a; i++) { 
				if (m[i + 1] < m[i]) {
					swaper = m[i];
					m[i] = m[i + 1];
					m[i + 1] = swaper;
				}
			}
			System.out.println(Arrays.toString(m));
		}
	}
}
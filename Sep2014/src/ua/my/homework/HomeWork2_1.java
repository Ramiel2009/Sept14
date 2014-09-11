package ua.my.homework;

import java.util.Arrays;

//ДЗ: отсортировать массив пузырьковым методом


public class HomeWork2_1 {

	public static void main(String[] args) {

		int[] m = { 11, 13, 19, 15, 16, 12, 18, 14, 17, 10 };
		int sw;
		for (int a = 0; a < m.length - 1; a++) { //пока счетчик меньше 9

			for (int i = 0; i < m.length - 1 - a; i++) { //пока счетчик меньше 
				if (m[i + 1] < m[i]) {
					sw = m[i];
					m[i] = m[i + 1];
					m[i + 1] = sw;
				}
			}
			System.out.println(Arrays.toString(m));
		}
	}
}
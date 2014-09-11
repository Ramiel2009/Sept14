package ua.my.homework;

import java.util.Arrays;

//Создать массив из 12 элементов, каждый элемент является колличеством дней месяца. Заполнить масив в цикле минимальным количеством строк.


public class HomeWork2_2 {

	public static void main(String[] args) {
		int m [] = new int [12];
		int a = 0; 
		for (int i=0; i<m.length; i++ ){
		m[i] = 31-a;
		a = i <6? (i % 2 != 0 ? 0 : 1) : (i % 2 == 0 ? 0 : 1);
		}
		System.out.println(Arrays.toString(m));
	}
}

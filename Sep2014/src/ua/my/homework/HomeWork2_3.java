package ua.my.homework;

import java.util.Arrays;

public class HomeWork2_3 {

	//Сделать реверс масива 
	public static void main(String[] args) {
		
		int a[] = {1, 2, 4, 3, 8, 11};
		for (int i=0; i<a.length/2; i++){ //берем первую половину массива
			int tmp = a[i];				  //меняем местами элементы в первой и второй половине
			a[i]=a[a.length-i-1];
			a[a.length-1-i]=tmp;
		}
		System.out.println(Arrays.toString(a));
	}

}

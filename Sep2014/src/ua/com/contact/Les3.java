package ua.com.contact;

import java.util.Arrays;
import java.util.Scanner;

//ДЗ: отсортировать массив пузырьковым методом
//Создать массив из 12 элементов, каждый элемент является колличеством дней месяца. Заполнить масив в цикле минимальным количеством строк.
//В цикле вывести 21 число фибоначи
//Сделать реверс масива 
//с клавиатуры вводится число, вывести - четное оно или не четное
// вводится латинская буква - гласная она или согласная
//Хорстман - масивы

public class Les3 {

	public static void main(String[] args) {
/*		double x;
		x= ((int)(Math.PI*100));
		x = (double) x;					// x = ((int)(Math.PI*100))/100.0;
		x = x/100;
		System.out.println(x);
		
		int a=-15;
		System.out.println(Math.abs(a));
		System.out.println(Math.sqrt((16))); //квадратный корень
		System.out.println(Math.pow(2, 1/2)); // 2 в кубе
		System.out.println(Math.random()); // работает от 0 до 1 (>=0 && <1)
		System.out.println((int)(Math.random()*10));
		System.out.println(Math.random()+3); // рандом от 3 до 4
		System.out.println(Math.random()*5); // рандом от 0 до 5
		System.out.println(Math.random()*5+3); // рандом от 5 до 8
*/
		
		/*Scanner in = new Scanner (System.in); //ввод данных
		int n;
		System.out.println("Enter number:");
		if (in.hasNextInt()){
		n=in.nextInt();
		System.out.println("Your choise was: " +n);
		}
		else System.out.println("It was not int");*/
/****************************************/
	/*	boolean check = true;
		while (check = true){
		Scanner in = new Scanner (System.in);
		int n;
		System.out.println("Please Enter number (int): ");
			if (in.hasNextInt()){
				n=in.nextInt();
				System.out.println("Your number was:" +n);
			check=false;
			in.close();
			}else System.out.println("It was not int!");
	*/	
		
	/*	int n = ((int) (Math.random()*100));
		int counter = 1;
		int a = 0;
		System.out.println(n);
		boolean check=true;
		while (check){
			Scanner in = new Scanner(System.in);
			System.out.println("Enter  number: ");
			a= in.nextInt();
			
			if (a>n) System.out.println("Number is less then");
			if (a<n) System.out.println("My number is bigger then");

			if (a==n){
				System.out.println("You win!");
				check=false;
			}
			
			if (counter==6){
				check=false;
				System.out.println("GAME OVER");
			}counter++;
		} */
		
		
		
		// int []a = new int [5]; //обьявление масива
		// int b []; //same as ^
		// int b [] = new int [5]; //масив из 5 обьектов, 5 значений со значением по умолчанию - 0
		// System.out.println(b.length); //b.length - вывести длину масива
		/* int b [] = {3, 2, 5};
		for (int i=0; i<b.length; i++);
		System.out.println(b);
		System.out.println("------");
		System.out.println(Arrays.toString(b));
 		a = b;
 		System.out.println(Arrays.toString(a));
 		
 		System.arraycopy(b, 0, a, 0, b.length); */
		/////////////////////////////////////////
//		int a [][] = new int [3][3];
	//	System.out.println(Arrays.deepToString(a));
		
		//рандомными числами заполнить массив из 10 чисел
		
	/*	int []a = new int [10];
		for (int i = 0; i<a.length; i++){
			a[i] = (int)(Math.random()*100);
			
		}
		System.out.println(Arrays.toString(a));
		*/
		
		char [] b = {'e', 'd', 'd', 'd', 'd'}; 
		for (int i = 0; i<b.length; i++){
		boolean flag;
		if (flag=true){
			
			b[b.length -i -1];
			
		}
		}
	}			
}
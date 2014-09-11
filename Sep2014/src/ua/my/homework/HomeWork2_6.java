package ua.my.homework;

public class HomeWork2_6 {

	// В цикле вывести 21 число фибоначи
	public static void main(String[] args) {
		int fbn1 = 0;
		int fbn2 = 1;
		for (int i = 1; i < 11; i++) {
				System.out.println(fbn1);
				System.out.println(fbn2);
				fbn1 = fbn1 + fbn2;
				fbn2 = fbn1 + fbn2;	
		}	
		System.out.println(fbn1);
	}
}

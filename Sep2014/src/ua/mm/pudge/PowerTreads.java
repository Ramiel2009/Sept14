package ua.mm.pudge;

import java.util.Scanner;

public class PowerTreads {
	int str;
	int agl;
	int intel;
	public int[] getPT(int type){ 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select PowerTreads type! 1 - strength, 2 - agility, 3 - intelligence");
		type = scanner.nextInt();
		switch (type){	//1. str 2. agl 3. int
		case 1:
			str = 8;
			agl = 0;
			intel = 0;
			break;
		case 2:
			str = 0;
			agl = 8;
			intel = 0;
			break;
		case 3:
			str = 0;
			agl = 0;
			intel = 8;
			break;
		}
		System.out.println("\nPower Treads equiped");
		int pt[] = {str, agl, intel};
		return pt;
	}
}

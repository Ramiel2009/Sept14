package ua.mm.boat_oop;

import java.util.Scanner;

public class GameMain {
	int hpTurn;
	int hpSize;


	public static void main(String[] args) {

		/*HealthPack hPack = new HealthPack();
		hPack.hpTurn=(int) (1 + Math.random() * 8);
		
		
		hPack.setHPTurn();
		System.out.println(hPack.hpTurn);
		
		
		hPack.setHPSize();
		if (hPack.setHPSize()==1){
			System.out.println("1!");
		}
		else 
			System.out.println("2!");
		}
		*/

		
		Boat boatik = new Boat();
		boatik.setGo(10, 0);		
		if (boatik.i == 0) {
			boatik.setGameOver("FINISH");
		}
	}
}

package ua.mm.boat_oop;


public class GameMain {
	int hpTurn;
	int hpSize;


	public static void main(String[] args) {

		/*HealthPack hPack = new HealthPack();		
		
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
		boatik.setGo(60, 0);		//HP on start(int), start position (int)
		if (boatik.i == 0) {
			boatik.setGameOver("FINISH");
		}
	}
}

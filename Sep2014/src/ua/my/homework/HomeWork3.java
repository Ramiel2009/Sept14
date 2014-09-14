package ua.my.homework;

import java.util.Arrays;
import java.util.Scanner;

//Есть человечек. Длина пути 10 шагов. Появляется на первом отрезке. Отбражение | - человечек. ____ - путь. d -> a<-. 
//По окончанию - гейм овер. По пути рандомно падает аптечка. У человечкка есть уровень здоровье. 
//Изначально здоровье есть 60 хп. Аптечка рандомная - 20 или 40. Обозначается +. 
//Когда наступает на + аптечка падает в инвентарь. Если нажата 1 - юзать маленькую аптечку (20хп), нажать 2- юзается большая (40хп).

//Программа решения квадратного уровнения, a, b, c ввод с консоли.
//String buffer, String builder 

public class HomeWork3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int health = 60;
		int repairLevel = 0;
		int i = 0;
		int hp;
		double HPx = Math.random() + 1;
		if (HPx < 1.5) {
			hp = 1;
		} else
			hp = 2;
		double hpTurn = Math.random() * 9;
		char game[] = { '\u26F5', '~', '~', '~', '~', '~', '~', '~', '~', '~' };
		System.out.println("------------------------------- \n" + " ☀" + ""
				+ "\n\n" + Arrays.toString(game) + "\n | HP = " + health
				+ "|| Repair level: " + repairLevel + "|");
		boolean hpPicked = false;

		do {
			if (game[9] != '\u26F5') {
				Scanner in1 = new Scanner(System.in);
				String forward;

				forward = in1.nextLine();

				// for(int i = 0; i<game.length;){
				// /////////////////////////////////////////////////////Forward////////////////////////////////////////
				if (forward.equals("d") || forward.equals("D")) { // If "D" key
																	// pressed
					if (forward.equals("1")) {
						if (repairLevel == 1) {
							hp = 20;
							health = health + hp;
						} else
							hp = 40;
						health = health + hp;
					}
					i++;
					if (i != (int) hpTurn) {
						hpPicked = true;
						game[0] = '~';
						game[1] = '~';
						game[2] = '~';
						game[3] = '~';
						game[4] = '~';
						game[5] = '~';
						game[6] = '~';
						game[7] = '~';
						game[8] = '~';
						game[9] = '~';
						game[(int) hpTurn + 1] = '+';

						game[i] = '\u26F5';
						System.out.println("------------------------------- \n"
								+ " ☀" + "" + "\n\n" + Arrays.toString(game)
								+ "\n | HP = " + health + "|| Repair level: "
								+ repairLevel + "|");
					}

					else {
						game[0] = '~';
						game[1] = '~';
						game[2] = '~';
						game[3] = '~';
						game[4] = '~';
						game[5] = '~';
						game[6] = '~';
						game[7] = '~';
						game[8] = '~';
						game[9] = '~';
						repairLevel = hp;

						game[i] = '\u26F5';
						System.out.println("------------------------------- \n"
								+ " ☀" + "" + "\n\n" + Arrays.toString(game)
								+ "\n | HP = " + health + "|| Repair level: "
								+ repairLevel + "|");
					}
					// /////////////////////////////////////////////////////Back////////////////////////////////////////////////////
				} else if (forward.equals("a") || forward.equals("A")) {

					i--;
					game[0] = '~';
					game[1] = '~';
					game[2] = '~';
					game[3] = '~';
					game[4] = '~';
					game[5] = '~';
					game[6] = '~';
					game[7] = '~';
					game[8] = '~';
					game[9] = '~';
					game[(int) hpTurn] = '+';

					game[i] = '\u26F5';
					System.out.println("------------------------------- \n"
							+ " ☀" + "" + "\n\n" + Arrays.toString(game)
							+ "\n | HP = " + health + "|| Repair level: "
							+ repairLevel + "|");

				}
				// //////////////////////////////////////////////Using
				// HealthPack/////////////////////////////////////////////////
				if (forward.equals("1") && hpPicked == true) { // 20HP used
					if (repairLevel == 1) {
						hp = 20;
						health = health + hp;
						game[0] = '~';
						game[1] = '~';
						game[2] = '~';
						game[3] = '~';
						game[4] = '~';
						game[5] = '~';
						game[6] = '~';
						game[7] = '~';
						game[8] = '~';
						game[9] = '~';
						game[(int) hpTurn] = '+';

						game[i] = '\u26F5';
						System.out.println("------------------------------- \n"
								+ " ☀" + "" + "\n\n" + Arrays.toString(game)
								+ "\n | HP = " + health + "|| Repair level: "
								+ repairLevel + "|");
						hpPicked = false;
					}

					else if (repairLevel == 2 && hpPicked == true) { // 40HP
																		// used
						hp = 40;
						health = health + hp;
						game[0] = '~';
						game[1] = '~';
						game[2] = '~';
						game[3] = '~';
						game[4] = '~';
						game[5] = '~';
						game[6] = '~';
						game[7] = '~';
						game[8] = '~';
						game[9] = '~';
						game[(int) hpTurn] = '+';

						game[i] = '\u26F5';
						System.out.println("------------------------------- \n"
								+ " ☀" + "" + "\n\n" + Arrays.toString(game)
								+ "\n | HP = " + health + "|| Repair level: "
								+ repairLevel + "|");
						repairLevel = 0;
						hpPicked = false;
					} else if (repairLevel == 0) {
						System.out.println("You don't have a Repair Kit");
					}
				}

			}
		} while (i < game.length - 1);
		System.out.println("Game Over, Captain!");

	}
}
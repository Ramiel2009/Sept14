package ua.mm.boat_oop;

import java.util.Arrays;
import java.util.Scanner;

public class Boat {
	int i;
	int hp;
	String forward;
	int HPx;
	boolean hpPicked = false;
	boolean picked = false; 
	double hpTurn;
	int repairLevel;
	int health;
	char game[];

	
public int setGo( int health, int i){
	int repairLevel = 0; // 0 - нет аптечки, 1 - маленькая, 2 - большая
	double hpTurn = 1 + Math.random() * 8; // Шаг на котором выпадает аптечка
	int hp;
	double HPx = Math.random() + 1; // Выбор размера аптечки
	if (HPx < 1.5) {   				
		hp = 1;					
	} else						
		hp = 2;				
	hpTurn = 1 + Math.random() * 8; // Шаг на котором выпадает аптечка
	// Стартовое поле
	char game[] = { '~', '~', '~', '~', '~', '~', '~', '~', '~', '~' };
	game[(int) hpTurn] = '\u2612';
	game [i] = '\u26F5';
	System.out.println("------------------------------- \n" + " ☀" + ""
			+ "\n\n" + Arrays.toString(game) + "\n | HP = " + health
			+ "|| Repair level: " + repairLevel + "|\n");
	boolean hpPicked = false;
	boolean picked = false;
	do {
		if (game[9] != '\u26F5') { // если корабль не на 10 позиции - играем дальше
			Scanner in1 = new Scanner(System.in);
			String forward;
			System.out.println(" Yo-ho-ho, and a bottle of rum! Your turn, Captain!:");
			forward = in1.nextLine();

			if ((forward.equals("1") && hpPicked == false)					//Проверка возможности использования аптечки
					|| (forward.equals("2") && hpPicked == false)) {
				System.out.println("You don't have a Repair Kit");
			}
			if (hpPicked == true) {  		//если аптечка поднята, заменяем в массиве + на ~
				game[i] = '~';
			}				
			//////////////////////////////Forward//////////////////////////////
			if (forward.equals("d") || forward.equals("D")) { // If "D" key
				i++;
				if ((i != (int) hpTurn)|| ((i==(int)hpTurn)&& picked == true)) { // if your don't picking the health pack on this turn
					Arrays.fill(game, '~');
					game[(int) hpTurn] = '\u2612';
					if (picked == true) {
						game[(int) hpTurn] = '~';
					}
					game[i] = '\u26F5';
					System.out.println("\n\n\n\n\n\n\n"+"------------------------------- \n"
							+ " ☀" + "" + "\n\n" + Arrays.toString(game)
							+ "\n | HP = " + health + "|| Repair level: "
							+ repairLevel + "|\n");
				}
				else if (i == (int) hpTurn) { // If you picking the health pack on this turn
					Arrays.fill(game, '~');
					repairLevel = hp;
					picked = true;
					if (picked == true) {				//если аптечка поднята, заменяем в массиве + на ~
						game[(int) hpTurn] = '~';
					}		
					game[i] = '\u26F5';
					System.out.println("\n\n\n\n\n\n\n"+"------------------------------- \n"
							+ " ☀" + "" + "\n\n" + Arrays.toString(game)
							+ "\n | HP = " + health + "|| Repair level: "
							+ repairLevel + "|\n");
					System.out.println("\n You found a treasure chest! There is some repair toolkits inside!\n" +
										"Use its to restore your HP!\n");
					hpPicked = true;
				}
				//////////////////////////////Back//////////////////////////////
			} else if (forward.equals("a") || forward.equals("A")) {
				if ((forward.equals("a") || forward.equals("A")) && i == 0) {
					System.out.println("Don't be a sea rat! Go ahead");
					i++;
				}
				i--;
				if ((i != (int) hpTurn)|| ((i==(int)hpTurn)&& picked == true)) { // if your don't picking the health pack on this turn
					Arrays.fill(game, '~');
					game[(int) hpTurn] = '\u2612';
					if (picked == true) {
						game[(int) hpTurn] = '~';
					}
					game[i] = '\u26F5';
					System.out.println("\n\n\n\n\n\n\n"+"------------------------------- \n"
							+ " ☀" + "" + "\n\n" + Arrays.toString(game)
							+ "\n | HP = " + health + "|| Repair level: "
							+ repairLevel + "|\n");
				}
				else if (i == (int) hpTurn) { // If you picking the health pack on this turn
					Arrays.fill(game, '~');
					repairLevel = hp;
					picked = true;
					if (picked == true) {				//если аптечка поднята, заменяем в массиве + на ~
						game[(int) hpTurn] = '~';
					}		
					game[i] = '\u26F5';
					System.out.println("\n\n\n\n\n\n\n"+"------------------------------- \n"
							+ " ☀" + "" + "\n\n" + Arrays.toString(game)
							+ "\n | HP = " + health + "|| Repair level: "
							+ repairLevel + "|\n");
					System.out.println("\n You found a treasure chest! There is some repair toolkits inside!\n" +
										"Use its to restore your HP!\n");
					hpPicked = true;
							}
			}
				//////////////////////////////Using HealthPack//////////////////////////////
			if (forward.equals("1") && hpPicked == true && repairLevel == 1) { // 20HP used
				hp = 20;
				health = health + hp;
				Arrays.fill(game, '~');
				game[i] = '\u26F5';
				repairLevel = 0;
				System.out.println("\n\n\n\n\n\n\n"+"------------------------------- \n"
						+ " ☀" + "" + "\n\n" + Arrays.toString(game)
						+ "\n | HP = " + health + "|| Repair level: "
						+ repairLevel + "|\n");
				System.out.println("Using small Repair Toolkit! HP level increased! HP+" +hp);
				hp = 0;
				hpPicked = false;
			}
			else if (forward.equals("2")&&repairLevel == 1 && hpPicked==true){			//Wrong repair tools used!
				System.out.println("To use small Repair Toolkit press '1' button!");
		}
			if (forward.equals("2") && repairLevel == 2 && hpPicked == true) { // 40HP used
				hp = 40;
				health = health + hp;
				Arrays.fill(game, '~');
				repairLevel = 0;
				game[i] = '\u26F5';
				System.out.println("\n\n\n\n\n\n\n"+"------------------------------- \n"
						+ " ☀" + "" + "\n\n" + Arrays.toString(game)
						+ "\n | HP = " + health + "|| Repair level: "
						+ repairLevel + "|\n");
				System.out.println("Using small Repair Toolkit! HP level increased! HP+" +hp);
				game[(int) hpTurn] = '+';
				hp = 0;
				hpPicked = false;		
			}
			else if (forward.equals("1")&&repairLevel == 2 && hpPicked==true){			//Wrong repair tools used
					System.out.println("To use small repair toolkit press '1' button!");
			}
		}
	}
	while (i < game.length-1);
	return 0;
	}
public void setGameOver (String gameOver){
	System.out.println(gameOver);
	}
}
package ua.mm.pudge;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		HeroSelection hero = new HeroSelection();
		boolean game = true;
		Scanner scanner = new Scanner(System.in);
		while (game == true){
		switch (hero.setHero()) {
		case 1:
			Pudge pudge = new Pudge();
			pudge.setHealth();
			pudge.setAttack();
			pudge.getMainInfo();
			System.out.println("\nSelect your equipment (1 - Power Treads; 2 - Circlet):");
			int itemId = scanner.nextInt();
			switch (itemId) {
				case 1:
					PowerTreads pt = new PowerTreads();
					int ptStats[] = pt.getPT(1);
					pudge.setAttributes(ptStats);
					pudge.getMainInfo();
					break;
				case 2:
					Circlet cir = new Circlet();
					int cirStats[] = cir.getCirclet();
					pudge.setAttributes(cirStats);
					pudge.getMainInfo();
					break;
			}
			do{
				String attack = scanner.nextLine().toString();
				System.out.println("Press 'A' button to hurt yourself!");
				
				if (attack.equals("a")||attack.equals("A")){
					pudge.setDamage();
					pudge.getMainInfo();
				}
			}
			while (pudge.health>0);
			pudge.setDeath();
			scanner.close();
			game = false;
			break;
			////////URSA///////
			
			
		case 2:
			System.out.println("Ursa was selected");
			Ursa ursa = new Ursa();
			ursa.setHealth();
			ursa.setAttack();
			ursa.getMainInfo();
			System.out.println("\nSelect your equipment (1 - Power Treads; 2 - Circlet):");
			
			itemId = scanner.nextInt();
			switch (itemId) {
				case 1:
					PowerTreads pt = new PowerTreads();
					int ptStats[] = pt.getPT(1);
					ursa.setAttributes(ptStats);
					ursa.getMainInfo();
					break;
				case 2:
					Circlet cir = new Circlet();
					int cirStats[] = cir.getCirclet();
					ursa.setAttributes(cirStats);
					ursa.getMainInfo();
					break;
			}
			do{
				String attack = scanner.nextLine().toString();
				System.out.println("Press 'A' button to hurt yourself!");
				
				if (attack.equals("a")||attack.equals("A")){
					ursa.setDamage();
					ursa.getMainInfo();
				}
			}
			while (ursa.health>0);
			ursa.setDeath();
			scanner.close();
			game = false;
			break;
		}
	}
}
}
	
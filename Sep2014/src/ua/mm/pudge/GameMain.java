package ua.mm.pudge;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		Pudge pudge = new Pudge();
		pudge.setStartHealth();
		pudge.setStartAttack();
		pudge.setStartMana();
		Ursa ursa = new Ursa();
		ursa.setStartHealth();
		ursa.setStartMana();
		ursa.setStartAttack();
		PowerTreads pt = new PowerTreads();
		Circlet cir = new Circlet();
		HeroSelection hero = new HeroSelection();
		boolean game = true;
		Scanner scanner = new Scanner(System.in);
		while (game == true){
		switch (hero.setHero()) {
		case 1:
			pudge.getMainInfo();
			System.out.println("\nSelect your equipment (1 - Power Treads; 2 - Circlet; 3 - select both):");
			int itemId = scanner.nextInt();
			switch (itemId) {
				case 1:
					int ptStats[] = pt.getPT(1);
					pudge.setAttributes(ptStats);
					pudge.getMainInfo();
						break;
				case 2:	
					int cirStats[] = cir.getCirclet();
					pudge.setAttributes(cirStats);
					pudge.getMainInfo();
					break;
					default:
						break;
				case 3: 
					int ptStats1[] = pt.getPT(1);
					int cirStats1[] = cir.getCirclet();
					pudge.setAttributes(ptStats1);
					pudge.setAttributes(cirStats1);
					pudge.getAttInfo();
					pudge.getMainInfo();	
						break;		
			}
			do{
				String attack = scanner.nextLine();
				System.out.println("\nPress 'A' button to hurt yourself!");				
				if (attack.equals("a")||attack.equals("A")){
					pudge.setDamage();
					pudge.getMainInfo();
					if (ursa.mana<30){
						System.out.println("Not enought mana to attack! Game Over!");
						ursa.setDeath();
						break;
					}
				}
			}
			while (pudge.health>0);
			pudge.setDeath();
			scanner.close();
			game = false;
			break;
			
			////////URSA///////
						
		case 2:
			ursa.getMainInfo();
			System.out.println("\nSelect your equipment (1 - Power Treads; 2 - Circlet; 3 - select both):");
			itemId = scanner.nextInt();
			switch (itemId) {
				case 1:				
					int ptStats[] = pt.getPT(1);
					ursa.setAttributes(ptStats);
					ursa.getAttInfo();
					ursa.getMainInfo();
						break;
				case 2:				
					int cirStats[] = cir.getCirclet();
					ursa.setAttributes(cirStats);
					ursa.getAttInfo();
					ursa.getMainInfo();
						break;
				case 3: 
					int ptStats1[] = pt.getPT(1);
					int cirStats1[] = cir.getCirclet();
					ursa.setAttributes(ptStats1);
					ursa.setAttributes(cirStats1);
					ursa.getAttInfo();
					ursa.getMainInfo();	
						break;
			}
			do{
				String attack = scanner.nextLine();
				System.out.println("\nPress 'A' button to hurt yourself!");				
				if (attack.equals("a")||attack.equals("A")){
					ursa.setDamage();
					ursa.getMainInfo();
					if (ursa.mana<30){
						System.out.println("Not enought mana to attack! Game Over!");
						ursa.setDeath();
						break;
					}
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
	
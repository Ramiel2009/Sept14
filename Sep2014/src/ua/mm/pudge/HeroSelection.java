package ua.mm.pudge;

import java.util.Scanner;

public class HeroSelection {

	public int setHero() {
		boolean picked = false;
		System.out.println("Select your hero! Type hero name in the field below to start!");
		Scanner scanner = new Scanner(System.in);
		while (picked == false) {
			String selectHero = scanner.nextLine();
			if (selectHero.equals("Pudge") || selectHero.equals("pudge")) {
				Pudge pudge = new Pudge();
				pudge.setSpawn();
				picked = true;
				int heroId = 1;
				return heroId;
			} else if (selectHero.equals("Ursa") || selectHero.equals("ursa")) {
				Ursa ursa = new Ursa();
				ursa.setSpawn();
				picked = true;
				int heroId = 2;
				return heroId;
			} else {
				System.out.println("Currently availible heroes: Pudge, Ursa");
			}
		}
		return 0;
	}
}
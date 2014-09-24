package ua.mm.pudge;

public class Ursa {

	int str = 23;
	int agl = 18;
	int intel = 16;
	int attack = 24;
	int health = 288;
	int damage = 0;
	
	public void setSpawn() {
		int spawnS = (int) ((Math.random()*4)+1);
		switch (spawnS) {
		case 1:
			System.out.println("\n\t\"Ursa Warrior!\"");
			break;
		case 2:
			System.out.println("\n\t\"I defend what is mine\"");
			break;
		case 3:
			System.out.println("\n\t\"Come not near the darkwoods where my kindred sleep\"");
			break;
		case 4:
			System.out.println("\n\t\"It is my spirit that keeps me safe, and not mere armor\"");
			break;
		case 5:
			System.out.println("\n\t\"Fuzzy Wuzzy!\"");
			break;
		}
		getAttInfo();
	}
	
	public void setAttack() {
		attack += str;
	}

	public void setHealth() {
		health += str * 13;
	}

	public void setDamage() {
		health = health - attack;
	}

	public void setDeath() {
		if (health <= 0)
			System.out.println("Ursa has been killed");
	}

	public void setAttributes(int a[]) {
		str += a[0];
		agl += a[1];
		intel += a[2];
		setAttack();
		setHealth();
	}

	void getAttInfo() {
		System.out.println("\nAttributes: " + "Strength: " + str + "; Agility: "
				+ agl + "; Intelligence: " + intel);
	}

	void getMainInfo() {
		System.out.println("Attack: " + attack + "; Health: " + health);
	}
}

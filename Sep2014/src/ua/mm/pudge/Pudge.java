package ua.mm.pudge;

public class Pudge {

	int str = 25;
	int agl = 14;
	int intel = 14;
	int attack = 30;
	int health = 300;
	int damage = 0;

	public void setSpawn() {
		int spawnS = (int) ((Math.random()*4)+1);
		switch (spawnS) {
		case 1:
			System.out.println("\n\"They call me the Butcher\"");
			break;
		case 2:
			System.out.println("\n\"Pudge is here\"");
			break;
		case 3:
			System.out.println("\n\"Someone needed a Butcher?\"");
			break;
		case 4:
			System.out.println("\n\"Make room for Pudge!\"");
			break;
		case 5:
			System.out.println("\n\"Butcher's in business\"");
			break;
		}
		getAttInfo();
	}

	public void setAttack() {
		attack += str;
	}

	// Counting HP
	public void setHealth() {
		health += str * 13;
	}

	// Dealing Damage
	public void setDamage() {
		health = health - attack;
	}

	// DEATH
	public void setDeath() {
		if (health <= 0)
			System.out.println("Pudge has been killed");
	}

	// Counting primary attributes
	public void setAttributes(int a[]) {
		str += a[0];
		agl += a[1];
		intel += a[2];
		setAttack();
		setHealth();
	}

	void getAttInfo() {
		System.out.println("\nPudge Attributes: " + "Strength: " + str + "; Agility: "
				+ agl + "; Intelligence: " + intel);
	}

	void getMainInfo() {
		System.out.println("Attack: " + attack + "; Health: " + health);
	}
}

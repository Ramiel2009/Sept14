package ua.mm.pudge;

public class Hero {

	int str = 1;
	int agl = 1;
	int intel = 1;
	int attack = 1;
	int health = 1;
	int damage = 1;

	

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
			System.out.println("Hero has been killed");
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
		System.out.println("\nHero info: " + "Strength: " + str + "; Agility: "
				+ agl + "; Intelligence: " + intel);
	}

	void getMainInfo() {
		System.out.println("Attack: " + attack + "; Health: " + health);
	}
}


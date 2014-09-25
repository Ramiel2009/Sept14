package ua.mm.pudge;

public class Pudge {

	int str = 25;		int aStr = 0;
	int agl = 14;		int aAgl = 0;
	int intel = 14;		int aIntel = 0;
	int attack = 30;
	int health = 150;
	int mana = 0;
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

	public void setStartAttack() {
		attack += str;
	}
	public void setAttack(){
		attack += aStr;
	}
	
	public void setStartHealth() {
		health += str * 19;
	}
	public void setHealth(){
		health += aStr * 19;
	}
	
	public void setDamage() {
		Ursa ursa = new Ursa();
		ursa.setDamage();
		health = health - ursa.attack;
		ursa.mana -= 30;
	}
	public void setDeath() {
		if (health <= 0)
			System.out.println("Pudge has been killed");
	}
	
	public void setStartMana(){
		mana += intel *13;
	}
	public void setMana(){
		mana += aIntel *13;
	}

	public void setAttributes(int a[]) {
		aStr += a[0];
		aAgl += a[1];
		aIntel += a[2];
		setAttack();
		setHealth();
		setMana();
	}

	void getAttInfo() {
		System.out.println("\nAttributes: " + "Strength: " + str + "+("+ aStr+ ")" + "; Agility: "
				+ agl + "+("+ aAgl+ ")" + "; Intelligence: " + intel+ "+("+ aIntel+ ")");
	}

	void getMainInfo() {
		System.out.println("\nAttack: " + attack + "; Health: " + health+ "; Mana: " + mana);
	}
}

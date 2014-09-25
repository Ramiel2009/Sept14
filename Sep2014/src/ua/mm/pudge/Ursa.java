package ua.mm.pudge;

public class Ursa {

	int str = 23; 		int aStr = 0;
	int agl = 18;		int aAgl = 0;
	int intel = 16; 	int aIntel = 0;
	int attack = 24;
	int health = 150;
	int mana = 0;
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
	
	public void setStartMana(){
		mana += intel *13;
	}
	public void setMana(){
		mana += aIntel *13;
	}

	public void setDamage() {
		Pudge pudge = new Pudge();
		pudge.health -= attack;
		mana -= 30; 
	}
	public void setDeath() {
		if (health <= 0)
			System.out.println("Ursa has been killed");
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
		System.out.println("\nAttack: " + attack + "; Health: " + health + "; Mana: " + mana);
	}
}

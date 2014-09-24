package ua.mm.boat_oop;

public class HealthPack {
	int hp;
	double HPx;
	int hpTurn;

	public int setHPSize() {
		HPx = (Math.random() + 1); // Выбор размера аптечки
		if (HPx < 1.5) {
			hp = 1;
		} else if (HPx >= 1.5){
			hp = 2;
			}
		return hp;
	}

	public int setHPTurn() {
		hpTurn = (int)(1 + Math.random() * 8); // Шаг на котором выпадает// аптечка
		System.out.println(hpTurn);
		return (int) hpTurn;
		
	}
}

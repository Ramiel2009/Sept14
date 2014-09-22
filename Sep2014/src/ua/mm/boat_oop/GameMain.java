package ua.mm.boat_oop;

public class GameMain {

	public static void main(String[] args) {

		Boat boatik = new Boat();

		boatik.setGo(10, 7);// int HP on start, int start position
		System.out.println(boatik.i);
		if (boatik.i == 0) {
			boatik.setGameOver("");
		}
	}
}

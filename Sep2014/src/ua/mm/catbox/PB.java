package ua.mm.catbox;

public class PB {

	boolean tune = false;
	int brightness = 0;
	boolean intim = false;

	void setBrightness() {
		brightness=0;
	}

	void setTurnOn(int brightness) {		
			tune=true;
		if (brightness >= 5 && brightness < 100) {
			tune = true;
			System.out.println("Включено");

		}
		if (brightness > 100) {
			tune = false;
			System.out.println("Бабах");
		}
		if (brightness < 5){
			tune = false;
			System.out.println("Недостаточно яркости");
		}
	}

	void setTurnOff() {
		brightness = 0;
		tune = false;
		System.out.println("Выключено");
	}
	
	void setIntim (){
		brightness = 20;
		tune = true;
		System.out.println("Включен интимчик");
	}
	
	void getInfo() {
		System.out.println("Состояние: " + tune);
		System.out.println("Яркость: " + brightness);

	}

}

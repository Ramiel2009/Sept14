package ua.mm.classwork13;

public abstract class Snake extends Pet{
	Snake(){
	name="Snake";
	hungry=false;
	
	getVoice();
	}
	
	void getHungry(){
		System.out.println(hungry);
	}
}

package ua.mm.classwork10;

public class Car {
	String model;
	String mark;
	int wheels;
	double engine;	
	double eng;
	
	void setEngine(double engine){
		this.engine=engine;
	}
	
	void getInfo(){
		System.out.println("Model="+model);
		System.out.println("Mark="+mark);
		System.out.println("Wheels="+wheels);
		System.out.println("Engine="+engine);
	}
}

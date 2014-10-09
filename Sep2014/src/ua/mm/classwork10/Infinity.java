package ua.mm.classwork10;

public class Infinity extends Car{
	String parktronic="Pioneer";
	Infinity(){
		model="FX35";
		mark="Infinity";
		wheels=4;
		engine=3.5;
		getInfo();
		}
	
	void getInfo(){
		System.out.println("Model="+model);
		System.out.println("Mark="+mark);
		System.out.println("Wheels="+wheels);
		System.out.println("Engine="+engine);
		System.out.println(parktronic);
	}
}

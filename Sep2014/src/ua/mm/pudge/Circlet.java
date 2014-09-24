package ua.mm.pudge;

public class Circlet { //circlet of nobility
	
	int str;
	int agl;
	int intel;
	
	public int[] getCirclet (){
		str = 2;
		agl = 2;
		intel = 2;
		int [] circlet = {str, agl, intel};
		System.out.println("\nCirclet of nobilty was equiped");
		return circlet;
	}
}

package ua.mm.classwork10;

public class GalaxyTab extends TabletPC{
	String gps = "I'M WATCHING YOU";
	
	
	public GalaxyTab(int screenSize, String screenType, int cores){
		super(screenSize, screenType, cores);
	/*	super.screenSize = 8;
		super.screenType = "Amoled";
		super.cores = 4;*/
		}
	
	void getInfo(){
		System.out.println("Screen Size = "+screenSize);
		System.out.println("Screen Type = "+screenType);
		System.out.println("Number of cores = "+cores);
		System.out.println("GPS System = " +gps);
	}
}

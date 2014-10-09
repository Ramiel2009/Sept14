package ua.mm.classwork10;

public class TabletPC {
	int screenSize;
	String screenType;
	int cores;
	
	 TabletPC(int screenSize, String screenType, int cores){
		this.screenSize = screenSize;
		this.screenType=screenType;
		this.cores=cores;
	}
	
	void getTabletPC(){
		System.out.println("Screen Size= "+screenSize);
		System.out.println("Screen Type= "+screenType);
		System.out.println("Number of cores= "+cores);
		System.out.println();
	}
}

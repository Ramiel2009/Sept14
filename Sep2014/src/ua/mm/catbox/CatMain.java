package ua.mm.catbox;

public class CatMain {

	//Описать человечка в ООП. Всё что относится к хар-ками - находится в классе с человечком. В мейне - оболочка игры. Оболочка - это в циклне считывание данных ввода консоли. В цикле отлавливать флаг
	
	/*public static void showCat(){
		System.out.println("Here's a cat");
	}*/
	
	public static void main(String[] args) {
	
	//		showCat();
		/*CatBox smallbox;
		smallbox = new CatBox();
		System.out.println("catbox="+smallbox);
		smallbox.depth=5;
		smallbox.length=5;
		smallbox.width=5;
		smallbox.getInfo();

		
		CatBox bigbox = new CatBox();
		smallbox = new CatBox();
		System.out.println("catbox="+smallbox);
		bigbox.depth=10;
		bigbox.setLenght();
		bigbox.width=10;
		
		bigbox.getInfo();
		
		bigbox.setParam1(15, 15, 15);
		bigbox.getInfo();*/
		
		CatBox catbox = new CatBox();
		catbox.crazyM();	
	}
}

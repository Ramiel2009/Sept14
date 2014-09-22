package ua.mm.catbox;


public class CatBox {

		int length;
		int width;
		int depth;
		int v1;
		
		
		void setLenght(){
			length=10;
		}
		void setParam(){
			length=10;
			width=10;
			depth=10;
		}
		void  setParam1(int lenght, int width, int depth){
			
		}
		
		void crazyM(){
			v1=v1+1;
			System.out.println("v1");
			crazyM();
		}
		
		void getInfo(){
			System.out.println("depth="+depth);
			System.out.println("width="+width);
			System.out.println("lenght="+length);
		}
	

}

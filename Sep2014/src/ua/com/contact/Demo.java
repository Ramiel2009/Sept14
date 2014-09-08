package ua.com.contact;

//1. Приоритеты операций присваивания (инкремент, дикремент).
//2. Описание ifelse
//3. Данно sum - сумма покупок в магазине.
	//Известно, что если сумма покупки от 0 до 300, то скидка = 0. От 300 до 500 = 3%. 500-800 = 5%, 800+ = 10%;
	// Ваша скидка 5%. И того к оплате: сумма минус %.
	// реализация 2 способами - через if / else, или switch / case (типы данных);

public class Demo {

	/*byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	boolean g;
	char h = '3';
	
	void printVars(){	
	System.out.println("a="+a);
	System.out.println("b="+b);
	System.out.println("c="+c);
	System.out.println("d="+d);
	System.out.println("e="+e);
	System.out.println("f="+f);
	System.out.println("g="+g);
	System.out.println("h="+h);
	}
	
	public static void main(String[] args) {
		Demo demo = new Demo ();
		demo.printVars();
		
	}*/
	public static void main (String [] args){
	/*	int k = 10;
		k += 15; //сокращенная запись
		//k%=3;
		k++; //пост инкремент
		++k; //пре инкремент
		System.out.println(k); */
/*	int k = 1;
		if (k==1){
			
			System.out.println("k=1");
		} else 
		{
			System.out.println("wtf !");
		}
		System.out.println(k ==1); */
		/*************************************************/
		/*char login;
		char password;
		
		login = 'a';
		password = 'z';
		
		if (login == 'a' && password == 'z'){
			System.out.println("Access granted!");
		}
		else{
			System.out.println("Access denied");
			
			
		}
		System.out.println = (login=="a" && password == 'b'?"Ok":"Not ok");
	}*/
		/*int t = 101;
		System.out.println(t<=0?"ice":(t>0 && t<100)?"water": "steam");*/
		/****************************************/
		
/*		int week=8;
		switch (week){
			case 1: 
			System.out.println("Mon");
			break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
				default:
				System.out.println("WTF");
				break;
			
		}*/
 /************************************/
		/*
		for (int i=0; i<5; i++){
		System.out.println(i);
		}*/
		/**************************************/
		/*
		int i=0;
		while (i<5){
			System.out.println(++i);
		}
		System.out.println("-----------------");
		i=0;
		do {
			System.out.println(i++);
		} while (i<5); */
}

}

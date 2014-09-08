package ua.my.homework;

//3. Данно sum - сумма покупок в магазине.	
	// Известно, что если сумма покупки от 0 до 300, то скидка = 0. От 300 до 500 = 3%. 500-800 = 5%, 800+ = 10%;
	// Ваша скидка 5%. И того к оплате: сумма минус %.
	// реализация 2 способами - через if / else, или switch / case (типы данных)

public class HomeWork1 {
	public static void main(String [] args){
		

	int sum = 100;	//введите сумму
	
	if (sum <= 0) { 
		System.out.println("Сумма не может быть нулем или меньше. Введите другое значение!");
	}
	else {
	if (sum > 0 && sum <=300){
		System.out.println ("Ваша скидка 0%. И того к оплате:"+sum+"-"+"0% = "+ sum);
	}
		else {
			if (sum > 300 && sum <= 500){
				System.out.println ("Ваша скидка 3%. И того к оплате:"+sum+"-"+"3% = "+ (sum -((sum/100)*3)));
			}
				else {
					if (sum > 500 && sum <= 800){
						System.out.println ("Ваша скидка 5%. И того к оплате:"+sum+"-"+"5% = "+ (sum -((sum/100)*5)));
				}
					else {
						if (sum > 800){
							System.out.println ("Ваша скидка 10%. И того к оплате:"+sum+"-"+"10% = "+ (sum -((sum/100)*10)));
								}			
							}
					}
				}
		}
	}
}

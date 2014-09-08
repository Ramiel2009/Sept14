package ua.my.homework;

//3. Данно sum - сумма покупок в магазине.	
	// Известно, что если сумма покупки от 0 до 300, то скидка = 0. От 300 до 500 = 3%. 500-800 = 5%, 800+ = 10%;
	// Ваша скидка 5%. И того к оплате: сумма минус %.
	// реализация 2 способами - через if / else, или switch / case (типы данных);

public class HomeWork1_1 {

	public static void main(String[] args) {
int sum = 900;
int id = sum/100;
if (sum<=0){
	System.out.println("Введенное число должно быть больше нуля! Введите другое значение!");
}
else
switch (id) {
	case  0:
		System.out.println("Sum = "+sum+". Discount = 0%. Total = "+sum);
		break;
	case  1:
		System.out.println("Sum = "+sum+". Discount = 0%. Total = "+sum);
		break;
	case  2:
		System.out.println("Sum = "+sum+". Discount = 0%. Total = "+sum);
		break;
	case  3:
		System.out.println("Sum = "+sum+". Discount = 3%. Total = "+sum + "-3% = "+(sum-(sum/100*3)));
		break;
	case  4:
		System.out.println("Sum = "+sum+". Discount = 3%. Total = "+sum + "-3% = "+(sum-(sum/100*3)));
		break;
	case  5:
		System.out.println("Sum = "+sum+". Discount = 5%. Total = "+sum + "-5% = "+(sum-(sum/100*5)));
		break;
	case 6:
		System.out.println("Sum = "+sum+". Discount = 5%. Total = "+sum + "-5% = "+(sum-(sum/100*5)));
		break;
	case 7:
		System.out.println("Sum = "+sum+". Discount = 5%. Total = "+sum + "-5% = "+(sum-(sum/100*5)));
		break;
	default:
		System.out.println("Sum = "+sum+". Discount = 10%. Total = "+sum + "-10% = "+(sum-(sum/100*10)));
		break;

}
	}
}

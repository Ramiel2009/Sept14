package ua.my.homework;

//3. ����� sum - ����� ������� � ��������.	
	// ��������, ��� ���� ����� ������� �� 0 �� 300, �� ������ = 0. �� 300 �� 500 = 3%. 500-800 = 5%, 800+ = 10%;
	// ���� ������ 5%. � ���� � ������: ����� ����� %.
	// ���������� 2 ��������� - ����� if / else, ��� switch / case (���� ������);

public class HomeWork1_1 {

	public static void main(String[] args) {
int sum = 900;
int id = sum/100;
if (sum<=0){
	System.out.println("��������� ����� ������ ���� ������ ����! ������� ������ ��������!");
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

package ua.my.homework;

//3. ����� sum - ����� ������� � ��������.	
	// ��������, ��� ���� ����� ������� �� 0 �� 300, �� ������ = 0. �� 300 �� 500 = 3%. 500-800 = 5%, 800+ = 10%;
	// ���� ������ 5%. � ���� � ������: ����� ����� %.
	// ���������� 2 ��������� - ����� if / else, ��� switch / case (���� ������)

public class HomeWork1 {
	public static void main(String [] args){
		

	int sum = 100;	//������� �����
	
	if (sum <= 0) { 
		System.out.println("����� �� ����� ���� ����� ��� ������. ������� ������ ��������!");
	}
	else {
	if (sum > 0 && sum <=300){
		System.out.println ("���� ������ 0%. � ���� � ������:"+sum+"-"+"0% = "+ sum);
	}
		else {
			if (sum > 300 && sum <= 500){
				System.out.println ("���� ������ 3%. � ���� � ������:"+sum+"-"+"3% = "+ (sum -((sum/100)*3)));
			}
				else {
					if (sum > 500 && sum <= 800){
						System.out.println ("���� ������ 5%. � ���� � ������:"+sum+"-"+"5% = "+ (sum -((sum/100)*5)));
				}
					else {
						if (sum > 800){
							System.out.println ("���� ������ 10%. � ���� � ������:"+sum+"-"+"10% = "+ (sum -((sum/100)*10)));
								}			
							}
					}
				}
		}
	}
}

package ua.my.homework;

// sum - total sum	
// If sum = 0 - 300, then discount = 0%. 300 - 500 = 3%. 500-800 = 5%, 800+ = 10%;
// Your discount is 5%. Total to pay: sum - discount %.
// two ways to solve - if/else statement and switch/case statement;

public class HomeWork1_2 {

	public static void main(String[] args) {
		int sum = -10004;
		int id = sum / 100;
		if (sum <= 0) {
			System.out
					.println("Entered sum must be bigger then 0! Please enter another sum");
		} else
			switch (id) {
			case 0:
				System.out.println("Sum = " + sum + ". Discount = 0%. Total = "	+ sum);
				break;
			case 1:
				System.out.println("Sum = " + sum + ". Discount = 0%. Total = "	+ sum);
				break;
			case 2:
				System.out.println("Sum = " + sum + ". Discount = 0%. Total = "	+ sum);
				break;
			case 3:
				System.out.println("Sum = " + sum + ". Discount = 3%. Total = "	+ sum + "-3% = " + (sum - (sum / 100 * 3)));
				break;
			case 4:
				System.out.println("Sum = " + sum + ". Discount = 3%. Total = "	+ sum + "-3% = " + (sum - (sum / 100 * 3)));
				break;
			case 5:
				System.out.println("Sum = " + sum + ". Discount = 5%. Total = "	+ sum + "-5% = " + (sum - (sum / 100 * 5)));
				break;
			case 6:
				System.out.println("Sum = " + sum + ". Discount = 5%. Total = "	+ sum + "-5% = " + (sum - (sum / 100 * 5)));
				break;
			case 7:
				System.out.println("Sum = " + sum + ". Discount = 5%. Total = "	+ sum + "-5% = " + (sum - (sum / 100 * 5)));
				break;
			default:
				System.out.println("Sum = " + sum
						+ ". Discount = 10%. Total = " + sum + "-10% = "
						+ (sum - (sum / 100 * 10)));
				break;

			}
	}
}

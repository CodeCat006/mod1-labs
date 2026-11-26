package lab4;

public class LoopsAndArrays {

	public static void main(String[] args) {
		int[] numbers = {1, 3, -5, 7, 0, 4, 6, 8};
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];

	}
		System.out.println("Sum:" + sum);
		
		double average = (double) sum / numbers.length;
		System.out.println("Average: " + average);
		
		int minimum = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < minimum) {
				minimum = numbers[i];
				System.out.println("Minimum: "+ minimum);
			}
		}
			int maximum = numbers[0];
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] > maximum) {
					maximum = numbers[i];
					
				}
				
			
		}
			System.out.println("Maximum: " + maximum);
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] == 0) {
					System.out.println("Index of zero: " + i);
					break;
				}
			}
			String[] students =  {"Alex", "Grace", "James", "Amber", "Steve"};
			int [] marks = {55, 82, 69, 44, 91};
			for (int i = 0; i < students.length; i++) {
				String grade = getGrade(marks[i]);
				System.out.printf("%s: %d - %s%n", students[i], marks[i], grade);
				//System.out.printf("Alex %s, Grace %s, James %s, Amber %s, Steve %s", Alex, Grace, James, Amber, Steve);
			} doubleMoney();
			multiplicationTable();
	}
	public static String getGrade(int mark) {
		if (mark < 1 || mark > 100) {
			return "Error: marks must be between 1 - 100";
		}
		else if (mark < 50) {
		return "Fail";
		} else if (mark >= 50 && mark <= 60) {
			return "Pass";
		} else if (mark >= 61 && mark <= 70) {
			return "Merit";
		} else {
			return "Distinction";
			
		}
		
	}
		public static void doubleMoney() {
			double initialMoney = 100;
					double currentMoney = 100;
					double interestRate = 0.05;
					int years = 0;
					while (currentMoney < 200) {
						currentMoney = currentMoney + (currentMoney * interestRate);
						years++;
					
		}
					System.out.printf("%d Years, £%.2f%n", years, currentMoney);
		}		
					public static void multiplicationTable() {
						for (int row = 1; row <= 10; row++) {
							for (int col = 1; col <= 10; col++) {
						 System.out.printf("%5d", col * row); 
					}
		System.out.println();
						}
					}
	
}

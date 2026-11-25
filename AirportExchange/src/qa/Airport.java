package qa;
import java.util.Scanner;
public class Airport {

	public static void main(String[] args) {
		System.out.println("Welcome to the Airport Currency Exchange!");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your amount in GBP");
		double amountGBP = input.nextDouble();
		
		System.out.println("Select your currency:"
				+ " 1 - USD, "
				+ "2 - EUR, "
				+ "3 - JPY");
		int currency = input.nextInt();
		
		System.out.println("Enter customer type:"
				+ " R - Regular, "
				+ " V - VIP, "
		        + "S - Staff");
		String customerType = input.next();

		double exchangeRate;
		
		switch (currency) {
		case 1:
		exchangeRate = 1.25;
		 break;
		case 2:
			exchangeRate = 1.15;
			break;
		case 3:
		exchangeRate = 180.50;
		break;
		default:
			System.out.println("Invalid currency option.");
			return;
		}
			
			double serviceFee;
			if (amountGBP < 100) {
			serviceFee = (amountGBP * 0.05);
			} else {
				serviceFee = (amountGBP * 0.025);
			}
		double amountAfterFee;
		amountAfterFee = amountGBP - serviceFee;
		System.out.println("Amount after fee:");
		System.out.println(amountAfterFee);
		
		double airportTax;
		if (customerType.equals("R")) {
			airportTax = amountAfterFee * 0.1;
		} else if (customerType.equals("V")) {
		 airportTax = amountAfterFee * 0.05;
		} else if (customerType.equals("S")) {
			airportTax = 0;
		}
		else {
			System.out.println("Invalid customer type");
			return;
		}
		double amountAfterTax;
		amountAfterTax = amountAfterFee - airportTax;
		
		System.out.println("Amount after tax:");
		System.out.println(amountAfterTax);
		
		double finalAmount;
		finalAmount = amountAfterTax * exchangeRate;
		int finalAmountInt;
				finalAmountInt = (int) finalAmount;
		System.out.println("Final amount:");
		System.out.println(finalAmountInt);
		
	}

}

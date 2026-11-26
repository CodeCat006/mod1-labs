package lab3;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*String name = getString("What is your name?");
		int age = getInt("How old are you?");
		System.out.printf("Hello %s! You are %d years old.%n", name, age);*/
	//theLunchQueue();
		int pounds = getInt("Please enter total weight in pounds (lb)"); 
		convertInputToStonesPounds(pounds);
		int kg = getInt("Please enter weight in kilograms:");
		convertKgsToStonesPounds(kg);
		
	}
	
		public static void theLunchQueue() {
			String mainCourse = getString("What main dish would you like (Fish, Burgers or veg)?");
			int roasties = getInt("How many roast potatoes would you like?");
			int brussels = getInt("How many Brussel Sprouts would you like?");
			System.out.printf("Hello, your lunch is %s with %d roast potatoes and %d Brussel Sprouts.%n", mainCourse, roasties, brussels);
		
	}
	
	public static int getInt(String prompt) {
		System.out.println(prompt);
		int x = sc.nextInt();
		return x;
	}
	public static String getString(String prompt) {
		System.out.println(prompt);
		String st = sc.nextLine();
		return st;
	}
	static void convertInputToStonesPounds(int pounds) {
		int remainingPounds = (pounds % 14);
		int stone = (pounds / 14);
		System.out.println("Weight in stone is:" + stone);
		System.out.printf("Total weight is %d stone and %d pounds.%n", stone, remainingPounds);
	}
	static void convertKgsToStonesPounds(int kg) {
		double pounds = (kg * 2.20462);
		int poundsInt = (int) pounds;
		convertInputToStonesPounds(poundsInt);
		
	}
	
}
















/*if (!mainCourse.equalsIgnoreCase("Fish") && !mainCourse.equalsIgnoreCase("Burgers") && !mainCourse.equalsIgnoreCase("veg")) {
System.out.println("Invalid main course selection.");
return;
}*/
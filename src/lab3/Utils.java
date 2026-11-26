package lab3;
import java.util.Scanner;
public class Utils {
	Scanner sc = new Scanner(System.in);
	public int getInt(String prompt) {
		System.out.println(prompt);
		int x = sc.nextInt();
		return x;
	}
	public String getString(String prompt) {
		System.out.println(prompt);
		String st = sc.nextLine();
		return st;
	}
}

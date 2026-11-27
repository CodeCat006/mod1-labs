package lab5;

public class BankingSystem {

	public static void main(String[] args) {
		Account myAccount = new Account(1, "Alex", 100.00);
		myAccount.deposit(100);
		myAccount.withdraw(30);
		System.out.println(myAccount.getDetails());
		
		Account[] accounts = {
				new Account(2, "Grace", 300.00),
				new Account(3, "James", 250.00),
				new Account(4, "Amber", 180.00),
				new Account(5, "Steve", 500.00)
				
		};
		for (Account acc : accounts) {
			System.out.println(acc.getDetails());
		}

	
myAccount.addInterest();
System.out.println(myAccount.getDetails());
Account partnerAccount = myAccount;
partnerAccount.addInterest();
System.out.println(myAccount.getDetails());
processAccount(myAccount);
System.out.println(myAccount.getDetails());
int k = 100;
incInt(k);
System.out.println(k);
	}
private static void incInt(int x) {
	x++;
}
	
	static void processAccount(Account acc) {
		acc.addInterest();
	
	}
}

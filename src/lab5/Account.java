package lab5;

public class Account {
private int id; 
private String owner; 
private double balance;

public void deposit(double amount) { 
	if(amount < 0) {
	System.out.println("Error");
} else { balance = (balance + amount);
} }
public void withdraw(double amount) {
	if(amount < 0) {
		System.out.println("Error");
	} else if  (amount > balance) {
	System.out.println("Insufficient funds");
	} else { balance = (balance-amount);
	} 
}
public Account(int id, String owner, double balance) {
	this.id = id;
	this.owner = owner;
	this.balance = balance;
}
public String getDetails() {
	return String.format("Accound ID: %d, Owner: %s, Balance: £%.2f", id, owner, balance);
}
public void addInterest() {
	balance = balance + (balance * 0.025);
}
}

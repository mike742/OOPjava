
public class Account {
	private int number;
	private int balance;
	
	public void showData() {
		System.out.println("#" + number + ": $" + balance);
	}
	
	public void setNumber(int value) {
		number = value;
	}
	
	public void deposit(int amount) {
		if(amount < 0) { 
			// show error
		}
		else {
			balance = balance + amount;
		}
	}
	
	public void withdraw(int amount) {
		if(amount < 0) { 
			// show error
		}
		else {
			balance = balance - amount;
		}
	}
}

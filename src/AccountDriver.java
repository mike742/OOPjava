
public class AccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Account a1 = new Account();
		
		//a1.balance = 100;
		a1.setNumber(123456);
		a1.deposit(100);
		a1.deposit(20);
		a1.deposit(-10);
		
		a1.withdraw(-50);
		a1.withdraw(20);
		
		a1.showData();
	}

}

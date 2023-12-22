
public class BankAccount {
	
	private int accountId;
	private double balance;
	public void BackAccount(){
		this.accountId=1;
		this.balance = 5000;
	}

	public double withdrawal(double amount) {
		return this.balance - amount;
	}

}

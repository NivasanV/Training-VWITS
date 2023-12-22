package in.co.vwits.bankapp.service;

import in.co.vwits.bankapp.exception.LowbalanceException;
import in.co.vwits.bankapp.model.Account;

public class AccountService {

	public float withdrawal(Account ac, float amount) throws LowbalanceException{
		if(ac.getBalance() > 0) {
			ac.setBalance(ac.getBalance() - amount);
			return ac.getBalance();
		}
		throw new LowbalanceException();
	}

	public float deposite(Account ac, float amount) {
		ac.setBalance(ac.getBalance() + amount);
		return ac.getBalance();
	}

	public boolean transferFund(Account sender, Account reciver, float amount) throws LowbalanceException {
		if(sender.getBalance() > amount) {
			sender.setBalance(sender.getBalance()-amount);
			reciver.setBalance(reciver.getBalance() + amount);
			return true;
		}
		throw new LowbalanceException();
	}

	public float getBalance(Account ac) {
		return ac.getBalance();
	}
}

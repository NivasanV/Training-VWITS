import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import in.co.vwits.bankapp.exception.LowbalanceException;
import in.co.vwits.bankapp.model.Account;
import in.co.vwits.bankapp.service.AccountService;

@DisplayName("Account Service Test Cases")
public class AccountServiceTest {
		
	private Account sender;
	private Account reciver;
	private Account zeroBalanceAccount;
	private AccountService service;
	
	
	@BeforeEach
	public void setUp() {
		sender = new Account(1,5000);
		reciver = new Account(2,10000);
		zeroBalanceAccount = new Account(3,0);
		service = new AccountService();

	}

	@Test
	@DisplayName("Withdraw")
	public void testWithdrawShouldWithdrawSuccessully() throws LowbalanceException {
		
		// Given
		float amount = 1000;
		// when
		float expectedBalance = 4000;
		float acctualBalance = service.withdrawal(sender, amount);
		// then
		assertEquals(expectedBalance, acctualBalance);
	}

	@Test
	public void depositeTest() {

		float amount = 1000;
		float expectedBalance = 11000;
		float acctualBalance = service.deposite(reciver,amount);
//		System.out.println(expectedBalance+" "+acctualBalance);
		assertEquals(expectedBalance, acctualBalance);
	}
	
	@Test
	public void testWithdrawShouldThrowLowbalanceException() {
		assertThrows(LowbalanceException.class, ()->service.withdrawal(zeroBalanceAccount, 1000) );
	}
	
	@Test
	public void transeferFundTest() throws LowbalanceException {
		assertEquals(true,service.transferFund(sender, reciver, 1000));
		assertEquals(11000,service.getBalance(reciver));
	}

	@Test
	public void traseferFundWithMorethanBalance() {
		assertThrows(LowbalanceException.class, ()->service.transferFund(sender, reciver, 25000));
	}
}

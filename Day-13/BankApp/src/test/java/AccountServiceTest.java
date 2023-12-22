import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import exception.LowbalanceException;
import model.Account;
import service.AccountService;

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
	public void testWithdrawShouldWithdrawSuccessully() {

		float amount = 1000;
		float expectedBalance = 4000;
		float acctualBalance = 0;
		try {
			acctualBalance = service.withdrawal(sender, amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(expectedBalance+" "+acctualBalance);
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
	public void tranceferFundTest() {
		assertEquals(true,service.transferFund(sender, reciver, 1000));
	}
	
	@Test
	public void testWithdrawShouldThrowLowbalanceException() {
		assertThrows(LowbalanceException.class, ()->service.withdrawal(zeroBalanceAccount, 1000) );
	}

}

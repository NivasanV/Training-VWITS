import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BankAccountTest {
	
	@Test
	public void withdraw() {
		BankAccount b = new BankAccount();
		double amount = 1000;
		double expectedBalance = 4000;
		double actualBalance = b.withdrawal(amount);
		System.out.println(expectedBalance+" "+actualBalance);
		assertEquals(expectedBalance,actualBalance);
	}
	
}

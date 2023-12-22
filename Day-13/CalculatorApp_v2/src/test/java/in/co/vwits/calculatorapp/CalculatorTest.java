package in.co.vwits.calculatorapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {
	private Calculator cal;

	@BeforeEach
	public void setUp() {
		System.out.println("set up");
		cal = new Calculator();
	}

	@DisplayName("Addition")
	@ParameterizedTest()
	@CsvSource({"2,2,4","1,1,2"})
	public void addShouldReturnCorrectResultTest(int num1,int num2, int expected) {

		// Given
		//Calculator cal = new Calculator();
		//int expected = 4;

		// When
		int actual = cal.add(num1, num2);

		// Then
		assertEquals(expected,actual,"Result are not as per our expected");
		System.out.println("Add");
	}

	@Test
	@DisplayName("Subtraction")
	public void subtractShouldReturnCorrectResultTest() {

		// Given
		//Calculator cal = new Calculator();
		int expected = 3;

		// When
		int actual = cal.subtract(7, 4);

		// Then
		assertEquals(expected,actual);
		System.out.println("sub");
	}

	@Test
	@DisplayName("Multiplication")
	public void multiplyShouldReturnCorrectResultTest() {

		// Given
		//Calculator cal = new Calculator();
		int expected = 9;

		// When
		int actual = cal.multiply(3, 3);

		// Then
		assertEquals(expected,actual);
		System.out.println("multiple");
	}

	@Nested
	class DivisionTests{

		@Test
		@DisplayName("Division")
		public void divideShouldReturnCorrectResultTest() {

			// Given
			//Calculator cal = new Calculator();
			int expected = 1;

			// When
			int actual = cal.divide(3, 3);

			// Then
			assertEquals(expected,actual);
			System.out.println("divide");
		}


		@Test
		@DisplayName("Division with throw Exception")
		public void divideShouldThrowArithmaticExceptionWhenDevideByZeroTest() {

			// Given
			//Calculator cal = new Calculator();
			assertThrows(ArithmeticException.class,()->{cal.divide(4,0	);});
			System.out.println("div with exception");
		}
	}

	@AfterEach
	public void tearDown() {
		System.out.println("tear down");
	}
}

package in.co.vwits.calculatorapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void addShouldReturnCorrectResultTest() {
		
		// Given
		Calculator cal = new Calculator();
		int expected = 4;
		
		// When
		int actual = cal.add(2, 2);
		
		// Then
		assertEquals(expected,actual,"Result are not as per our expected");
		
	}
	
	@Test
	public void subtractShouldReturnCorrectResultTest() {
		
		// Given
		Calculator cal = new Calculator();
		int expected = 3;
		
		// When
		int actual = cal.subtract(7, 4);
		
		// Then
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void multiplyShouldReturnCorrectResultTest() {
		
		// Given
		Calculator cal = new Calculator();
		int expected = 9;
		
		// When
		int actual = cal.multiply(3, 3);
		
		// Then
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void divideShouldReturnCorrectResultTest() {
		
		// Given
		Calculator cal = new Calculator();
		int expected = 1;
		
		// When
		int actual = cal.divide(3, 3);
		
		// Then
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void divideShouldThrowArithmaticExceptionWhenDevideByZeroTest() {
		
		// Given
		Calculator cal = new Calculator();
		assertThrows(ArithmeticException.class,()->{cal.divide(4,0	);});
		
	}
}

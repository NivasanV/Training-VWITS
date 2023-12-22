import in.co.vwits.calculatorapp.Calculator;

public class ClaculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		int expected = 4;
		int actual = cal.add(2, 2);
		if(expected == actual) {
			System.out.println("Working properly");
		}
		else {
			System.out.println("Not Working properly");
			System.out.println("Expected : "+expected);
			System.out.println("Actual : "+actual);
		}
	}

}

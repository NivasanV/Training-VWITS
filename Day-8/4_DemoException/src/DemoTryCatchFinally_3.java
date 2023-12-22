
public class DemoTryCatchFinally_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String str = null;
			System.out.println(str.length());
			System.out.println(5/0);
			System.out.println("Done"); // This line is not executed. Any statement before this line generate exception
		}
//		System.out.println("Any Statement b/w try and catch block is not possible"); Compilation Error 
		catch(ArithmeticException e) {
			System.out.println("Cannot Divide by Zero"); // catch block is executed only if associated try block has generated matching exception
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerExpetion Occured");
		}
	}

}

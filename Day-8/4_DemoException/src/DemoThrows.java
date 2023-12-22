
public class DemoThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			calculate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // it is used to print  log on console and also for debugging
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	static void calculate() throws Exception {
		Exception e = new Exception();
		throw e;	// Throwing exception programmatically
	}
}

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@DisplayName("this is demo test class")
public class Demo {

	@Test
	@DisplayName("This is demo test method")
	public void demoTest() {
		System.out.println("Demo Test");
	}

	@BeforeEach
	public void setUp() {
		System.out.println("Setup");
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("Tear Down");
	}
	
	@Test
	public void secondTest() {
		System.out.println("Second	Test");
	}
	
	@Disabled
	@Test
	public void testNewFeature() {
		System.out.println("In test new feature");
	}
	
	@Test
	@Timeout(10)
	public void testPerformance() {
		System.out.println("performance test");
	}
	
	@Test
	@RepeatedTest(3)
	public void repeatedTest() {
		System.out.println("repeated test");
	}
}

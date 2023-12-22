import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringUtilTest {

	@Test
	public void convertToLowerCaseTest() {
		StringUtil s = new StringUtil();
		String data = "INDIA";
		String expected = "india";
		String actual = s.convertToLowerCase(data);
		assertEquals(expected,actual);
	}
}

import java.time.LocalDateTime;

public class DemoLocalDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// In JDK 8, LocalDateTime Class is Introduced
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		LocalDateTime tmrw = today.plusDays(1);
		System.out.println(tmrw);
		LocalDateTime myDate = LocalDateTime.of(2001, 06, 02, 16, 04, 30);
		System.out.println(myDate);
		
	}

}

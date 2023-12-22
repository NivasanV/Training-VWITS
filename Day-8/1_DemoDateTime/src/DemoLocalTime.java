import java.time.LocalTime;

public class DemoLocalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// In JDK 8, LocalTime Class is Introduced
		LocalTime today = LocalTime.now();
		System.out.println(today);
		LocalTime tmrw = today.plusHours(1);
		System.out.println(tmrw);
		LocalTime myDate = LocalTime.of(16, 06, 02);
		System.out.println(myDate);

	}

}

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DemoZonedDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ZonedDateTime is used to represent the date and time with specific zone
		
		System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
		System.out.println(ZonedDateTime.now(ZoneId.of("America/New_York")));
		System.out.println(ZoneId.getAvailableZoneIds());
	}

}

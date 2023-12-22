import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DemoLocalDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// In JDK 8, LocalDate Class is Introduced
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalDate tmrw = today.plusDays(1);
		System.out.println(tmrw);
		LocalDate myDate = LocalDate.of(2001, 06, 02);
		System.out.println(myDate);
		System.out.println(today.isAfter(tmrw));
		System.out.println(today.isBefore(tmrw));
		System.out.println(today.until(tmrw, ChronoUnit.DAYS));
		
		// parse() is used to convert string to LocalDate
		LocalDate formattedDate = LocalDate.parse("10-01-2010", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(formattedDate);
		
	}

}

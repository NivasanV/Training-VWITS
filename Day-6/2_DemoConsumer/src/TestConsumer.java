import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cities = new ArrayList<>();
		cities.add("pune");
		cities.add("chennai");
		cities.add("mumbai");
		cities.add("bengaluru");
		cities.add("delhi");
		
		//Consumer<String> consumer = (String city) -> System.out.println(city.toUpperCase());
		//Consumer<String> consumer = city -> System.out.println(city.toUpperCase());
		/*
		 * forEach is a built in method which accepts consumer lambda
		 */
		//cities.forEach(consumer);
		cities.forEach(city -> System.out.println(city.toUpperCase())); // Recommended
	}

}

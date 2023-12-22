import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		
		// following is a long hand-way of using stream
		// it is not used this way in production
		// we have used it for understanding
		
		Stream<Integer> s = list.stream(); // Step 1
		Stream<Integer> filterStream = s.filter(num -> num%2 == 0); // Step2
		List<Integer> newList = filterStream.collect(Collectors.toList()); // Step3
		
		System.out.println(list);
		System.out.println(newList);
		
		// following is a short hand-way of using stream
		// it is not used this way in production
		// we have used it for understanding
		
		newList = list.stream()					// Step 1
				.filter(num -> num%2 == 0)		// Step 2
				.collect(Collectors.toList());	// Step 3
		
		System.out.println(newList);
	}

}

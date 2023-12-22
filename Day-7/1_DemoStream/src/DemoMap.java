import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
//		Stream<Integer> s = list.stream();
//		Stream<Integer> sfilter = filter(num -> num%2 == 0);
//		Stream<Integer> map = sfilter.map(num -> num*2);
//		List<Integer> newList = map.collect(Collectors.toList());
		
		List<Integer> evenSquare = list.stream()	// Step 1
				.filter(num -> num%2 == 0)			// Step 2.1
				.map(num -> num*num)				// Step 2.2
				.collect(Collectors.toList());		// Step 3
		
		System.out.println(list);
		System.out.println(evenSquare);
		

	}

}

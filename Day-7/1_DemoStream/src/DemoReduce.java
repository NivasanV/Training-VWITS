import java.util.ArrayList;
import java.util.List;

public class DemoReduce {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			List<Integer> l = new ArrayList<>();
			l.add(1);
			l.add(2);
			l.add(3);
			l.add(4);
			l.add(5);
			
			int sumOfSquareEven = l.stream()
					.filter(num -> num%2 == 0)
					.map(num -> num*num)
					.reduce(0, (i1,i2) -> i1+i2);
			
			System.out.println(l);
			System.out.println(sumOfSquareEven);

	}

}

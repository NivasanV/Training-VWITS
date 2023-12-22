import java.util.ArrayList;
import java.util.List;

public class NeedOfStreamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		
		List<Integer> evenList = new ArrayList<>();
		for(Integer i: l) {
			if(i%2 == 0) {
				evenList.add(i);
			}
		}
		
		System.out.println(l);
		System.out.println(evenList);
	}

}

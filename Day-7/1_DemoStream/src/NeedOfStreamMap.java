import java.util.ArrayList;
import java.util.List;

public class NeedOfStreamMap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		
		List<Integer> evenSquare = new ArrayList<>();
		for(Integer i: l) {
			if(i%2 == 0) {
				evenSquare.add(i*i);
			}
		}
		
		System.out.println(l);
		System.out.println(evenSquare);
	}

}

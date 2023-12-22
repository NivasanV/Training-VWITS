import java.util.Optional;

public class DemoOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<Integer> p = Optional.of(10);
		if(p.isPresent()) {
			System.out.println(p.get());
		}
		
		Optional<Object> d = Data.getData();
		if(d.isPresent()) {
			System.out.println(d.get());
		}
		else {
			System.out.println("No Record Found");
		}
	}

}

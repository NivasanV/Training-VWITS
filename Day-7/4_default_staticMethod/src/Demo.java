import java.util.List;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li= List.of(10,20);
		Printable.get();
		Stream.of(1,2);
		//In all above examples we are calling static of respective interfaces.
		//List and stream are built in interfaces where as Printable is custom interface.
		System.out.println(li);
	}

}

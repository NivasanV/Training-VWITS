
public interface Printable {
	
	//by default every method in interface is abstract 
	//till JDK 7 only abstract method were possible in interface
	void print();
	//from JDK 8 and above it is possible to write implemented method in 
	//an interface
	//following 2 type of methods are possible
	//1. Default Method
	default void color() {
		System.out.println("Black");
	}
	//2. Static Method
	static int get(){
		return 2;
	}
	
}

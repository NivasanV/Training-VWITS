public class CalculateLambda {
	public static void main (String[] args) {
		Calculate calc = (a,b)->{return (a+b);};
		System.out.println(calc.add(2,3));
		Calculate calc1 = (int a,int b)->{return (a+b);};
		System.out.println(calc1.add(5,7));
		Calculate calc2 = (a,b)->(a+b); 
		System.out.println(calc2.add(8,7));
		//If you plan to omitt data type for arguments then you 
		//either omitt for all or omitt for none otherwise we get a 
		//compilation error 
	}
}
public class TaxableLambda {
	public static void main (String[] args) {
        Taxable tx = inc -> {
		    return inc*0.1;
		};
		Taxable tx1 = inc1 -> inc1*0.1;
		System.out.println(tx1.calculateTax(1500));
		System.out.println(tx.calculateTax(3.07));
    }
} 
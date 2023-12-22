public class TestLambda {
    public static void main(String[] args) {
        
        
        Printable print1 = () -> {
            System.out.println("Printable print");
        };
        Printable print2 = () -> {System.out.println("Printable print");};
        Printable print3 = () -> System.out.println("Printable print");
        
        PrintableFormate printf1 = (String str)-> {
            System.out.println(str);
        };
        PrintableFormate printf2 = (String str)-> {System.out.println(str);};
        PrintableFormate printf3 = (String str)-> System.out.println(str);
        PrintableFormate printf4 = (str)-> System.out.println(str);
        
        
        print1.print();
        print2.print();
        print3.print();

        printf1.print("Hello all");
        printf2.print("Hello all");
        printf3.print("Hello all");
        printf4.print("Hello all");
    }
}

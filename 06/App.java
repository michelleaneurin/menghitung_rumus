public class App {
    public static void main(String[] args) {
    
        System.out.println("________BBITWISE : &");
        var a = 27;
        var b = 18;
        System.out.println("Nilai A = "  +a);
        System.out.println("Binary A = "  + Integer.toBinaryString(a));
        System.out.println("Nilai B = "  +b);
        System.out.println("Binary B = "  + Integer.toBinaryString(b));
        System.out.println("Nilai  (a &  b) = "  +( a & b));
        System.out.println("Binary (a + b) = "  + Integer.toBinaryString(a & b));

        System.out.println("________BBITWISE : |");
        System.out.println("Nilai A = "  +a);
        System.out.println("Binary A = "  + Integer.toBinaryString(a));
        System.out.println("Nilai B = "  +b);
        System.out.println("Binary B = "  + Integer.toBinaryString(b));
        System.out.println("Nilai  (a |  b) = "  +( a | b));
        System.out.println("Binary (a | b) = "  + Integer.toBinaryString(a | b));

        System.out.println("________BBITWISE : ^");
        System.out.println("Nilai A = "  +a);
        System.out.println("Binary A = "  + Integer.toBinaryString(a));
        System.out.println("Nilai B = "  +b);
        System.out.println("Binary B = "  + Integer.toBinaryString(b));
        System.out.println("Nilai  (a ^  b) = "  +( a ^ b));
        System.out.println("Binary (a ^ b) = "  + Integer.toBinaryString(a ^ b));

        System.out.println("__0______BBITWISE : ~");
        System.out.println("Nilai A = "  +a);
        System.out.println("Binary A = "  + Integer.toBinaryString(a));
        System.out.println("Nilai (~a) = "  +(~ a));
        System.out.println("Nilai Binary (~a)  = "  + Integer.toBinaryString(~a));
        
        System.out.println("____________ BITWISE : LEFT SHIFT (<<) ");
        System.out.println("Nilai A = "  +a);
        System.out.println("Binary A = "  + Integer.toBinaryString(a));
        System.out.println("Nilai (a << 1) =  "  +(a << 1)) ;
        System.out.println("Binary (a << 1)= "  + Integer.toBinaryString(a << 1));

        System.out.println("____________ BITWISE : LEFT SHIFT (>>) ");
        System.out.println("Nilai A = "  +a);
        System.out.println("Binary A = "  + Integer.toBinaryString(a));
        System.out.println("Nilai (a >> 2) =  "  +(a >> 2)) ;
        System.out.println("Binary (a >>  2)= "  + Integer.toBinaryString(a >> 2));
}       
}
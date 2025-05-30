
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        
        Scanner Inputan = new Scanner(System.in);
        
        System.out.print("Input panjang = ");
        byte p = Inputan.nextByte();
        System.out.print("Input Lebar = ");
        byte l = Inputan.nextByte();

        System.out.println("Luas pesergi panjang= " + (p * l));
        System.out.println("keliling pesergi  panjang= " + (2 * (p + l)));

        System.out.print("Inputan tinggi = ");
        byte t = Inputan .nextByte();
        System.out.println("volume balok =" + (t * (p * l)));
        }
}
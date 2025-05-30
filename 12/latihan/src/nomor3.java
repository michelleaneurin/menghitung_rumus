import java.util.Scanner;

public class nomor3 {

    public static int Faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Faktorial(n - 1); 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();

        int hasil = Faktorial(bilangan);

        System.out.println("Faktorial dari " + bilangan + " adalah: " + hasil);
        
        scanner.close();
    }
}

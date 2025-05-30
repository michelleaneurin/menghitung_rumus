import java.util.Scanner;

public class nomor6 {

    public static int Penjumlahan(int n, StringBuilder penjumlahan) {
        if (n == 1) {
            penjumlahan.append("1"); 
            return 1; 
        } else {
            penjumlahan.append(n).append(" + ");
            return n + Penjumlahan(n - 1, penjumlahan); 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int n = scanner.nextInt();

        StringBuilder penjumlahan = new StringBuilder();
        
        int hasil = Penjumlahan(n, penjumlahan);

        System.out.println("Hasil penjumlahan dari " + penjumlahan.toString() + " = " + hasil);
        
        scanner.close(); 
    }
}

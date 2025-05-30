import java.util.Scanner;

public class nomor2 {

    public static int balik(int n, int hasil) {
        if (n == 0) {
            return hasil; 
        }
        return balik(n / 10, hasil * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan sebelom dibalik: ");
        int bilangan = scanner.nextInt();

        int hasil = balik(bilangan, 0);

        System.out.println("Bilangan setelah dibalik: " + hasil);
        
        scanner.close(); 
    }
}


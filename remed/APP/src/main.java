import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        rumus rumus = new rumus();
        int pilihan;

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Gerak Lurus Beraturan (GLB)");
            System.out.println("2. Gerak Lurus Berubah Beraturan (GLBB)");
            System.out.println("3. Cepat Rambat Gelombang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Input harus angka. Pilih menu: ");
                scanner.next();
            }

            pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    rumus.glb();
                    break;
                case 2:
                    rumus.glbb();
                    break;
                case 3:
                    rumus.cepatRambatGelombang();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}


// git remote add origin https://github.com/michelleaneurin/menghitung-rumus-fisika.git
// git branch -M main
// git push -u origin main

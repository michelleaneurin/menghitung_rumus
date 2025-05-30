import java.util.Scanner;

public class App {
    public static int[] inputPanjangLebar() {
        Scanner scanner = new Scanner(System.in);
        int[] dimensi = new int[2];

        System.out.print(" panjang: ");
        dimensi[0] = scanner.nextInt();

        System.out.print(" lebar: ");
        dimensi[1] = scanner.nextInt();

        return dimensi;
    }

    public static int hitungKeliling(int panjang, int lebar) {
        return 2 * (panjang + lebar);
    }

    public static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }
    public static void gambar(int panjang, int lebar) {
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print(" *") ;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print(" panjang= ");
        int panjang = scanner.nextInt();

        System.out.print(" lebar= ");
        int lebar = scanner.nextInt();
        
        System.out.println();
        gambar(lebar, panjang);

        int keliling = hitungKeliling(panjang, lebar);
        int luas = hitungLuas(panjang, lebar);

        System.out.println("Luas = " + luas);
        System.out.println("Keliling =" + keliling);
        
    }
}


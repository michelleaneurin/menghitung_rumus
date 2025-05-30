import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double radius = scanner.nextDouble();

        double luas = Math.PI * Math.pow(radius, 2);
        double keliling = 2 * Math.PI * radius;

        System.out.printf("Luas lingkaran: %.0f%n", luas);
        System.out.printf("Keliling lingkaran: %.0f%n", keliling);

        scanner.close();
    }
}



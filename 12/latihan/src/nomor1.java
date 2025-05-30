import java.util.Scanner;

public class nomor1 {

    public static void barisan(int n) {
        if (n < 1) {
            return; 
        }
        barisan(n - 1);
        System.out.print(n + " "); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai : ");
        int n = scanner.nextInt();

        System.out.println("Barisan bilangan dari 1 hingga " + n + ":");
        barisan(n); 
        System.out.println(); 
        
        scanner.close(); 
    }
}


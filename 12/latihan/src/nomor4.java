import java.util.Scanner;

public class nomor4 {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1; 
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int jumlahBilangan = scanner.nextInt();

        System.out.println("Barisan Fibonacci: ");
        for (int i = 0; i < jumlahBilangan; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        
        System.out.println();
        scanner.close(); 
    }
}


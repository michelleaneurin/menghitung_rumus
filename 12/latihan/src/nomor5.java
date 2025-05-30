public class nomor5 {

    public static int pascal(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return pascal(n - 1, k - 1) + pascal(n - 1, k);
    }

    public static void tampilkanSegitigaPascal(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int baris = 6; 
        tampilkanSegitigaPascal(baris); 
    }
}


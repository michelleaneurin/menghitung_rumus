public class Lingkaran {
    public static void main(String[] args) {

        // Jari-jari lingkaran
        double jariJari = 40.0;
        
        // Menghitung luas dan keliling lingkaran
        double luas = Math.PI * Math.pow(jariJari, 2);
        double keliling = 2 * Math.PI * jariJari;

        // Menampilkan hasil
        System.out.printf("Jari-jari lingkaran: %.2f cm%n", jariJari);
        System.out.printf("Luas lingkaran: %.2f%n", luas);
        System.out.printf("Keliling lingkaran: %.2f%n", keliling);


        System.out.println("_________________");
        int a  = 11;
        int b = 2;
        System.out.println( a/b);
}
}

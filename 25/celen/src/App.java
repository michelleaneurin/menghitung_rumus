//MICHELLE ANEURIN 11 IPA  1 
abstract class BangunDatar {
    abstract double luas();
}

class Lingkaran extends BangunDatar {
    private double jari_jari;
    public Lingkaran(double jari_jari) {
        this.jari_jari = jari_jari;
    }
    double luas() {
        return Math.PI * jari_jari * jari_jari; 
    }
}

class Segitiga extends BangunDatar {
    private double alas, tinggi;
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    } 
    double luas() {
        return 0.5 * alas * tinggi;
    }
}
public class App {
    public static void main(String[] args) {
        BangunDatar lingkaran = new Lingkaran(10);
        BangunDatar segitiga = new Segitiga(15, 10);

        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Luas Segitiga: " + segitiga.luas());
    }
}
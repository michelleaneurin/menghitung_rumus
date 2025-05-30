import java.util.ArrayList;
interface Pantai {
    void air();
}

interface Gunung {
    void mendaki();
}

class Kota implements Pantai, Gunung {
    String nama;

    public Kota(String nama) {
        this.nama = nama;
    }

    public void air() {
        System.out.println("bermain air dan pasir di " + nama);
    }
    public void mendaki(){
        System.out.println("mendaki gunung di " + nama);
    }
}

public class App {
    public static void main(String[] args) {
        ArrayList<Kota> daftarKota = new ArrayList<>();

        daftarKota.add(new Kota("Palembang"));
        daftarKota.add(new Kota("Jakarta"));
        daftarKota.add(new Kota("Lampung"));

        for (Kota k : daftarKota) {
            k.air();
            k.mendaki();
            System.out.println();
        }
    }
}



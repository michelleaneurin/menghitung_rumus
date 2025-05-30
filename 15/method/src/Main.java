class Pelanggan {
    String nama;
    int uang;
    Makanan makanan;
    Minuman minuman;

    Pelanggan(String nama, int uang) {
        this.nama = nama;
        this.uang = uang;
    }

    void pilihMakanan(Makanan makanan) {
        this.makanan = makanan;
    }

    void pilihMinuman(Minuman minuman) {
        this.minuman = minuman;
    }

    void tampil() {
        int totalBelanja = 0;
        String makananNama = "Tidak ada";
        int hargaMakanan = 0;
        
        if (makanan != null) {
            makananNama = makanan.nama;
            hargaMakanan = makanan.harga;
            totalBelanja += hargaMakanan;
        }

        String minumanNama = "Tidak ada";
        int hargaMinuman = 0;

        if (minuman != null) {
            minumanNama = minuman.nama;
            hargaMinuman = minuman.harga;
            totalBelanja += hargaMinuman;
        }

        int sisaUang = uang - totalBelanja;

        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("Jumlah Uang Pelanggan: Rp " + uang);
        System.out.println("Makanan: " + makananNama);
        System.out.println("Harga Makanan: Rp " + hargaMakanan);
        System.out.println("Minuman: " + minumanNama);
        System.out.println("Harga Minuman: Rp " + hargaMinuman);
        System.out.println("Total Belanja: Rp " + totalBelanja);
        System.out.println("Maka Pembayaran Anda (Uang - Total Belanja): Rp " + sisaUang);
    }
}

class Makanan {
    String nama;
    int harga;

    Makanan(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }
}

class Minuman {
    String nama;
    int harga;

    Minuman(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }
}

public class Main {
    public static void main(String[] args) {
        Pelanggan pel1 = new Pelanggan("dimas", 20000);
        Makanan mie = new Makanan("Mie Instant", 10000);
        Makanan bakso = new Makanan("Bakso", 10000);
        Minuman teh = new Minuman("Teh Dingin", 50000);
        Minuman kopi = new Minuman("Kopi Dingin", 50000);

        pel1.pilihMakanan(mie);
        pel1.pilihMinuman(teh);
        pel1.tampil();
    }
}
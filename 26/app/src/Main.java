public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("budi");
        player1.Display();

        Object player2 = player1;
        String player1_ = player1.toString();
        String player2_ = player1.toString();
        System.out.println("String Player1 = " + player1_);
        System.out.println("String Player2 = " + player2_);
        Object Player3 = new Player("budi");
        System.out.println("String Player3 = " + Player3.toString
        ());

        Player player4 = new Player("santoso");
        Player player5 = new Player("santosi");

        System.out.println("------------");
        System.out.println(player1.equals(player2));
        System.out.println("-------------");
        System.out.println(player1.equals(Player3));
        System.out.println("-------------");
        System.out.println(player4.equals(player5));
        System.out.println(player4.equals("jaja"));
    }
}

// equals(object obj)	Bandingin isi objek
// toString()	Cetak isi objek ke bentuk string mengembalikan represntasi string dari object
// hashCode()	Kode hash objek (buat hash table)
// getClass()	Dapetin class objek
// clone()	Salin objek
// finalize()	Sebelum dihapus GC(garbage collector)
// wait()	Tunggu thread
// notify()	Bangunin 1 thread nunggu
// notifyAll()	Bangunin semua thread nunggu
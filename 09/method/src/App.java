public class App {
    public static void main(String[] args) {
        System.out.println("___________ METHOD/ FUNGSI : VOID");
        Tampil();
        Tampil();
        System.out.println("___________ METHOD : VOID - parameter");
        Bio("michelle aneurin", "XI IPA 1" , "PALEMBANG") ;

        System.out.println("___________ METHOD : RETURN - parameter");
    System.out.println("hasil tambah 5 + 7 = "+ (Tambah(5,7)));
    System.out.println("hasil rumusku 5 + 7 = "+ (Rumusku(5,7)));
        
    }
    private static void Tampil(){
        System.out.println("Heiiii......");
    }
    private static void Bio( String nama, String kelas, String alamat){
        System.out.println("nama =" +nama);
        System.out.println("kelas =" +nama);
        System.out.println("alamat =" +nama);
    }
    private static int Tambah(int x, int y){
        return x + y; 
    }
    private static int Rumusku(int x, int y){
        int hasil = x + y + x *y;
        return hasil; 
    }
}


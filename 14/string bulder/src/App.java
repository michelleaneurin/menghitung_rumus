import java.lang.StringBuilder;
public class App {
    public static void main(String[] args) {
        StringBuilder kata = new StringBuilder("INFORMATIKA");
        ket(kata);
        System.out.println("--------");
        kata.append("ipa1");
        ket(kata);
        System.out.println("-------");
        kata.insert(16, "terdapat 37 orang siswa didalam kelas");
        ket(kata);
        System.out.println("-------");
        kata.delete(0, 12);
        ket(kata);
        System.out.println("--------");
        kata.setCharAt(0, 4, "IPA2");
        ket(kata);
        System.out.println("-------");
        kata.replace(0, 4, "IPA2");
        ket(kata);
        System.out.println("-------");
        String katalain = kata.toString();
        Integer alamat = System.indentityHashCode(katalain);
        System.out.println("kata = " + katalain + "address = " + alamat.toHexString(alamat));        
    }
    private static void ket( StringBuilder kata){
        System.out.println("panjang = " + kata.length());
        System.out.println("kapasitas = " + kata.capacity());
        Integer address = System.indentityHashCode(kata);
        System.out.println("kata = " + kata + "address = " + address.toHexString(address));
    }
}
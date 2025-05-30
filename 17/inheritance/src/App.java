class kepalasekolah{
    String nama;
    void Hallo(){
        System.out.println("hallo saya...");
    }
}
class guru extends kepalasekolah{

}
public class App {
    public static void main(String[] args) {
        guru guruku = new guru();
        guru.Hallo();
        System.out.println("name = " + guruku.nama);
    }
}

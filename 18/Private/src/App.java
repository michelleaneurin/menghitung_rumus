// default.. private, public keyword
class siswa{
    String name; // default
    public int kelas;
    siswa( String name, int kelas ){
        this.name = name;
        this.kelas= kelas;
        // this.nilai = nilai;
        }
    }    
public class App {
    public static void main(String[] args) throws Exception {
        siswa s001 = new siswa( "Budi", 10);
        System.out.println("siswa : " + s001.name);
        s001.name="dudi";
        System.out.println("siswa:"+s001.name);
        siswa S002 = new siswa("sentosa" ,10);
        System.out.println("siswa : "+S002.name);
        S002.name = "sentosa";
        System.out.println("siswa:" + S002.name);

    }
}

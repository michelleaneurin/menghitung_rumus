import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner Inputan = new Scanner(System.in);
        System.out.println("nilai = ");
        int nilai = Inputan.nextInt();
        String status;
        if(nilai >= 90){
            status = "Berhasill......";
        } else { status = "gagalll............";}

        System.out.println("Status = " + status);
        System.out.println("_______________ TERNARY : ");
        status = nilai >= 95 ? "Berhasil " : "Gagallll";
        System.out.println("Status = " + status);


    }
}

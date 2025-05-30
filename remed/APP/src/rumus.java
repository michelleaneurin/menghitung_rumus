import java.util.Scanner;

public class rumus {
    Scanner input = new Scanner(System.in);

    public void glb() {
        System.out.println("\n--- Gerak Lurus Beraturan (GLB) ---");
        System.out.println("1. Mencari kecepatan (v = s/t)");
        System.out.println("2. Mencari jarak (s = v*t)");
        System.out.println("3. Mencari waktu (t = s/v)");
        System.out.print("Pilih jenis perhitungan: ");
        int pilihan = input.nextInt();

        float v, s, t;

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan jarak (m): ");
                s = input.nextFloat();
                System.out.print("Masukkan waktu (s): ");
                t = input.nextFloat();
                v = s / t;
                System.out.println("Kecepatan = " + v + " m/s");
                break;
            case 2:
                System.out.print("Masukkan kecepatan (m/s): ");
                v = input.nextFloat();
                System.out.print("Masukkan waktu (s): ");
                t = input.nextFloat();
                s = v * t;
                System.out.println("Jarak = " + s + " m");
                break;
            case 3:
                System.out.print("Masukkan jarak (m): ");
                s = input.nextFloat();
                System.out.print("Masukkan kecepatan (m/s): ");
                v = input.nextFloat();
                t = s / v;
                System.out.println("Waktu = " + t + " s");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    public void glbb() {
        System.out.println("\n--- Gerak Lurus Berubah Beraturan (GLBB) ---");
        System.out.println("1. Mencari kecepatan akhir (vt = v0 + a*t)");
        System.out.println("2. Mencari jarak (s = v0*t + 0.5*a*t^2)");
        System.out.print("Pilih jenis perhitungan: ");
        int pilihan = input.nextInt();

        float v0, a, t, vt, s;

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan kecepatan awal (m/s): ");
                v0 = input.nextFloat();
                System.out.print("Masukkan percepatan (m/s^2): ");
                a = input.nextFloat();
                System.out.print("Masukkan waktu (s): ");
                t = input.nextFloat();
                vt = v0 + a * t;
                System.out.println("Kecepatan akhir = " + vt + " m/s");
                break;
            case 2:
                System.out.print("Masukkan kecepatan awal (m/s): ");
                v0 = input.nextFloat();
                System.out.print("Masukkan waktu (s): ");
                t = input.nextFloat();
                System.out.print("Masukkan percepatan (m/s^2): ");
                a = input.nextFloat();
                s = v0 * t + 0.5f * a * t * t;
                System.out.println("Jarak = " + s + " m");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    public void cepatRambatGelombang() {
        System.out.println("\n--- Cepat Rambat Gelombang ---");
        System.out.println("Rumus: v = s / t");

        System.out.print("Masukkan jarak (m): ");
        float s = input.nextFloat();
        System.out.print("Masukkan waktu (s): ");
        float t = input.nextFloat();

        if (t != 0) {
            float v = s / t;
            System.out.println("Cepat rambat gelombang = " + v + " m/s");
        } else {
            System.out.println("Waktu tidak boleh nol.");
        }
    }
}

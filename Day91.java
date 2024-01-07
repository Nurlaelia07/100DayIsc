
import java.util.Scanner;

public class Day91 {

    public static void main(String[] args) {
        //Deklarasikan Variabel
        int kecepatan, waktu;
        Scanner sc = new Scanner(System.in);
        // Meminta untuk memasukkan nilai kecepatan
        System.out.print("Masukkan nilai kecepatan (km/jam): ");
        kecepatan = sc.nextInt();
        // Meminta  untuk memasukkan nilai waktu
        System.out.print("Masukkan waktu (jam) : ");
        waktu = sc.nextInt();
        // Hitung jarak tempuh
        double jarak = kecepatan * waktu;
        // Menampilkan jarak tempuh
        System.out.println("Jarak tempuh adalah " + jarak + " km.");
        // Fungsi untuk menghitung jarak tempuh
    }

    // Fungsi untuk menghitung jarak tempuh
    public static int hitungJarak(int kecepatan, int waktu) {
        return kecepatan * waktu;
    }
}

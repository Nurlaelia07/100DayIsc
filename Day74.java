
package ngoding;

import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Inisialisasi variabel
        int kelebihanSks;
        int hargaPerSks = 500_000;
        double pajak = 0.1;
        int hargaKotor;
        double potongan = 0;

        // Menerima input jumlah kelebihan sks
        System.out.print("Masukkan jumlah kelebihan sks\t:");
        kelebihanSks = sc.nextInt();

        // Menghitung harga kotor
        hargaKotor = hargaPerSks * kelebihanSks;

        // Menghitung potongan pajak
        if (kelebihanSks >= 4) {
            if (kelebihanSks >= 8) {
                potongan = 8 * pajak * hargaPerSks;
                hargaKotor = 8 * hargaPerSks;
            } else {
                potongan = kelebihanSks * pajak * hargaPerSks;
            }
        }

        // Menampilkan jumlah potongan
        System.out.println("jumlah potongan\t: " + potongan);

        // Menghitung jumlah total gaji dosen
        int hargaTotal = hargaKotor - (int)potongan;

        // Menampilkan jumlah total gaji dosen
        System.out.println("Jumlah total Gaji Dosen\t: " + hargaTotal);

    }
}

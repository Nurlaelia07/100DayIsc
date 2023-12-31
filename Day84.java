package ngoding;

import java.util.Scanner;

public class Day84 {

    public static void main(String[] args) {
        // Mendeklarasikan variabel `nilaiAkhir` untuk menyimpan nilai akhir
        int nilaiAkhir;
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner sc = new Scanner(System.in);
        // Meminta pengguna memasukkan nilai UTS
        System.out.print("Masukkan nilai UTS: ");
        int uts = sc.nextInt();
        // Meminta pengguna memasukkan nilai UAS
        System.out.print("Masukkan nilai UAS: ");
        int uas = sc.nextInt();
        // Menghitung nilai akhir
        nilaiAkhir = (uts * 30 / 100) + (uas * 70 / 100);
        // Menampilkan nilai akhir
        System.out.println("Nilai akhir: " + nilaiAkhir);
    }
}

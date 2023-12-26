package ngoding;

import java.util.Arrays;
import java.util.Scanner;

public class Day79 {

    public static void main(String[] args) {
        // Mendeklarasikan array dengan kapasitas 3 untuk menyimpan angka
        int[] array = new int[3];
        // Mendeklarasikan variabel jumlah untuk menyimpan hasil penjumlahan
        int jumlah = 0;
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner sc = new Scanner(System.in);
        // Perulangan untuk meminta input dan mengisi array sebanyak 3 kali
        for (int i = 0; i < array.length; i++) {
            // Meminta pengguna memasukkan angka
            System.out.print("Masukkan angka: ");
            int angka = sc.nextInt();
            // Menambahkan angka ke variabel jumlah
            jumlah += angka;
            // Menyimpan nilai jumlah ke dalam elemen array saat ini
            array[i] = jumlah;
            // Menampilkan nilai jumlah saat ini
            System.out.println("Jumlah: " + jumlah);
        }
        // Menampilkan semua isi array menggunakan metode toString dari kelas Arrays
        System.out.println("Semua isi array: " + Arrays.toString(array));
    }
}

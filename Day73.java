package ngoding;

import java.util.Scanner;

public class Day73 {
    // Fungsi untuk menghitung jumlah semua elemen dalam array

    public static int jumlah(int[] array) {
        // Variabel untuk menyimpan jumlah
        int jumlah = 0;
        // for each untuk setiap angka dalam array
        for (int angka : array) {
            // Tambahkan angka ke jumlah
            jumlah += angka;
        }
        // Kembalikan nilai jumlah
        return jumlah;
    }

    // Fungsi utama program
    public static void main(String[] args) {
        // array ukuran 5 
        int[] nilai = arr(new int[5]);
        // Cetak hasil penjumlahan array
        System.out.println("Jumlah dari semua angka : " + jumlah(nilai));
    }

    // Fungsi untuk mengisi nilai ke dalam array
    public static int[] arr(int[] array) {
        // Scanner untuk menerima input
        Scanner sc = new Scanner(System.in);
        // Perulangan untuk setiap indeks dalam array
        for (int i = 0; i < array.length; i++) {
            // Minta input dari pengguna
            System.out.print("Masukkan Nilai : ");
            // Simpan input ke dalam array
            array[i] = sc.nextInt();
        }
        // Kembalikan array yang sudah diisi
        return array;

    }
}

package ngoding;

import java.util.Scanner;

public class Day85 {

    // Program ini untuk menghitung penjumlahan bilangan genap dan ganjil dari 1 hingga angka yang dimasukkan oleh pengguna.
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna.
        Scanner sc = new Scanner(System.in);
        // Meminta pengguna memasukkan angka.
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();
        // Deklarasi variabel untuk menyimpan hasil penjumlahan bilangan genap dan ganjil.
        int genap = 0;
        int ganjil = 0;
        // Perulangan untuk menghitung penjumlahan bilangan genap dan ganjil.
        for (int i = 1; i < angka; i++) {
            // Memeriksa apakah i habis dibagi 2 dan hasilnya genap.
            if (i % 2 == 0) {
                // Menambahkan i ke variabel genap jika i genap.
                genap += i;
            } else {
                // Menambahkan i ke variabel ganjil jika i ganjil.
                ganjil += i;
            }
        }
        //  Menampilkan hasil penjumlahan bilangan genap dan ganjil.

        System.out.println("Hasil Penjumlahan Genap : " + genap);
        System.out.println("Hasil Penjumlahan Ganjil : " + ganjil);
    }
}

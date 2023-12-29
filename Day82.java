package ngoding;

import java.util.Scanner;

public class Day82 {

    public static void main(String[] args) {
        // Program ini berfungsi untuk membalikkan kata yang dimasukkan oleh pengguna.
        // Program ini menggunakan konsep perulangan for untuk melakukan iterasi dari belakang ke depan, 
        // mulai dari indeks terakhir hingga indeks pertama.
        // Inisialisasi variabel yang dibutuhkan.
        Scanner sc = new Scanner(System.in);
        // String kata dan string terbalik digunakan untuk deklarasi variabel kata dan terbalik. 
        String kata = "";
        String terbalik = "";
        // Membaca input dari pengguna berupa sebuah kata.
        System.out.print("Masukkan kata: ");
        kata = sc.nextLine();
        // Melakukan iterasi dari belakang ke depan, mulai dari indeks terakhir hingga indeks pertama.

        for (int i = kata.length() - 1; i >= 0; i--) {
            // Menambahkan karakter pada indeks `i` dari kata `kata` ke variabel `terbalik`.
            terbalik += kata.charAt(i);
        }
        // Menampilkan kata terbalik.
        System.out.println("Kata terbalik: " + terbalik);
    }
}

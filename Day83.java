package ngoding;

import java.util.Scanner;

public class Day83 {

    public static void main(String[] args) {
        // Program ini berfungsi untuk menampilkan pola segitiga bintang
        // dengan jumlah baris sesuai input dari pengguna.
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner sc = new Scanner(System.in);
        // Meminta pengguna memasukkan jumlah baris
        System.out.print("Masukkan jumlah baris: ");
        // Membaca input dari pengguna dan menyimpannya ke variabel x
        int x = sc.nextInt();
        // Perulangan luar untuk mencetak setiap baris
        for (int i = 1; i <= x; i++) {
            // Perulangan dalam untuk mencetak bintang pada setiap baris
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Mencetak bintang
            }
            // Pindah ke baris baru setelah mencetak satu baris bintang
            System.out.println();
        }
    }
}

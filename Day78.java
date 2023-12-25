package ngoding;

import java.util.Scanner;

public class Day78 {

    public static void main(String[] args) {

        // Untuk menyimpan hasil penjumlahan deret
        int jumlah = 0;
        // Untuk membaca input dari pengguna
        Scanner sc = new Scanner(System.in);
        // Input dari pengguna
        System.out.print("Masukkan nilai Batas : ");
        int angka = sc.nextInt();
        // Perulangan untuk menghitung deret
        for (int i = 1; i <= angka; i++) {
            // Cetak nilai i
            System.out.println(i);

            // Tambahkan nilai i ke dalam variabel jumlah
            jumlah += i;
        }

        // Cetak hasil penjumlahan deret
        System.out.println("Jumlah deret " + jumlah);
    }
}

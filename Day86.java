package ngoding;

import java.util.Scanner;

public class Day86 {

    // Mendeklarasikan variabel angka1, angka2, dan jumlah
    public static void main(String[] args) {
        int angka1, angka2, jumlah;

        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner sc = new Scanner(System.in);

        // Meminta untuk memasukkan angka 1
        System.out.print("Masukkan angka 1 : ");
        // Membaca input angka 1 dari keyboard
        angka1 = sc.nextInt();

        // Meminta untuk memasukkan angka 2
        System.out.print("Masukkan angka 2 : ");
        // Membaca input angka 2 dari keyboard
        angka2 = sc.nextInt();

        // Menghitung jumlah angka 1 dan angka 2
        jumlah = angka1 + angka2;

        // Jika jumlah genap, jumlah ditambah 1
        if (jumlah % 2 == 0) {
            jumlah += 1;
        } else {
            // Jika jumlah ganjil, jumlah ditambah 2
            jumlah += 2;
        }

        // Menampilkan hasil penjumlahan
        System.out.println("Hasil Penjumlahan : " + jumlah);
    }
}
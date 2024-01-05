package ngoding;

import java.util.Scanner;

public class Day89 {

    public static void main(String[] args) {
        // Inisialisasi scanner untuk membaca input dari pengguna.
        Scanner input = new Scanner(System.in);
        // Minta pengguna untuk memasukkan jumlah bilangan.
        System.out.print("Masukkan jumlah bilangan: ");
        int bil = input.nextInt();
        // Inisialisasi array untuk menyimpan bilangan-bilangan yang dimasukkan oleh pengguna.
        int[] bilangan = new int[bil];
        //  Minta pengguna untuk memasukkan n bilangan.
        System.out.println("Masukkan " + bil + " bilangan:");
        for (int i = 0; i < bil; i++) {
            bilangan[i] = input.nextInt();
        }
        // Inisialisasi variabel untuk menyimpan bilangan terbesar dan terkecil.
        int terbesar = bilangan[0];
        int terkecil = bilangan[0];
        // Perulangan untuk mencari bilangan terbesar dan terkecil.
        for (int i = 1; i < bil; i++) {
            // Jika bilangan[i] lebih besar dari terbesar, maka update nilai terbesar.
            if (bilangan[i] > terbesar) {
                terbesar = bilangan[i];
            } // Jika bilangan[i] lebih kecil dari terkecil, maka update nilai terkecil.
            else if (bilangan[i] < terkecil) {
                terkecil = bilangan[i];
            }
        }
        // Cetak bilangan terbesar dan terkecil.
        System.out.println("Bilangan terbesar: " + terbesar);
        System.out.println("Bilangan terkecil: " + terkecil);
    }
}

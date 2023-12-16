package ngoding;

import java.util.Arrays;

public class Day70 {

    public static void main(String[] args) {

        // Program ini menjumlahkan dua vektor 1 dan 2 yang masing-masing memiliki 7 elemen.
        // Elemen-elemen vektor 1 dan 2 didefinisikan di awal program.
        // Kemudian, vektor 1 dan 2 diurutkan terlebih dahulu sebelum dilakukan penjumlahan.
        // Hasil penjumlahan disimpan dalam vektor hasil yang baru.
        // Terakhir, hasil penjumlahan dicetak ke layar.
        // Mendefinisikan dua vektor 1 dan 2
        int[] vektor1 = {26, 19, 59, 78, 90, 102};
        int[] vektor2 = {51, 47, 24, 67, 89, 101};

        // Mengurutkan vektor1
        Arrays.sort(vektor1);
        System.out.println("Vektor 1: " + Arrays.toString(vektor1));
        // Mengurutkan vektor2
        Arrays.sort(vektor2);
        System.out.println("Vektor 2: " + Arrays.toString(vektor2));

        // Menjumlahkan vektor1 dan Vektor2
        int[] hasil = new int[vektor1.length];
        for (int i = 0; i < vektor1.length; i++) {
            hasil[i] = vektor1[i] + vektor2[i];
        }

        // Mencetak hasil penjumlahan
        for (int i = 0; i < hasil.length; i++) {
            System.out.println("(Vektor 1 + Vektor 2)[" + i + "] = " + hasil[i]);
        }
    }
}

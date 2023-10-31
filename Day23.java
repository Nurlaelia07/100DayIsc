package ngoding;

import java.util.Scanner;

public class Day23 {

    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        int angka;
        char ulang = 'Y'; // Inisialisasi ulang 'Y' agar program pertama kali berjalan.

        while (ulang == 'Y' || ulang == 'y') {
            System.out.print("Masukkan angka: ");
            angka = isc.nextInt();

            if (angka > 0) {
                System.out.println("Angka ini adalah angka positif.");
            } else if (angka < 0) {
                System.out.println("Angka ini adalah angka negatif.");
            } else {
                System.out.println("Angka ini adalah nol.");
            }

            System.out.print("Ingin menjalankan program lagi? (Ya/No): ");
            ulang = isc.next().charAt(0);
        }
    }
}

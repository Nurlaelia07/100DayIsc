package ngoding;

import java.util.Scanner;

public class Day14_Perulangan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int angka;
        // Perulangan do-while
        do {
            
            System.out.print("Masukkan bilangan bulat positif: ");
            angka = input.nextInt();

            // Jika angka >= 0, maka tampilkan angka yang dimasukkan
            if (angka >= 0) {
                // Mencetak angka yang dimasukkan pengguna
                System.out.println("Anda memasukkan: " + angka);
            } else {

                // Jika angka < 0, maka hentikan perulangan dan Menampilkan pesan keluar
                System.out.println("Terima kasih! Keluar dari program.");
            }

        } while (angka >= 0);

        // Menutup objek Scanner
        input.close();

    }
}

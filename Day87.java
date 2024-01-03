package ngoding;

import java.util.Scanner;

public class Day87 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner sc = new Scanner(System.in);
        // Meminta user memasukkan angka
        System.out.print("Masukkan angka: ");
        // Membaca angka yang dimasukkan
        int angka = sc.nextInt();
        // Perulangan untuk mencetak angka-angka tertentu
        for (int i = 0; i < angka; i++) {
            // Memeriksa apakah angka genap dan bukan kelipatan 3
            if (i % 2 == 0 && i % 3 != 0) {
                System.out.println(i);
            }
        }
    }
}

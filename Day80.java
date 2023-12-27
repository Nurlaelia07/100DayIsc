package ngoding;

import java.util.Scanner;

public class Day80 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner sc = new Scanner(System.in);
        // Meminta user untuk memasukkan nilai
        System.out.print("Masukkan nilai : ");
        // Membaca nilai yang dimasukkan user sebagai tipe data int
        int nilai = sc.nextInt();
        // Menentukan grade berdasarkan nilai yang dimasukkan
        if (nilai >= 90) {
            // Grade A untuk nilai >= 90
            System.out.println("Grade A");
        } else if (nilai >= 80) {
            // Grade B+ untuk nilai >= 80
            System.out.println("Grade B+");
        } else if (nilai >= 70) {
            // Grade B untuk nilai >= 70
            System.out.println("Grade B");
        } else if (nilai >= 60) {
            // Grade C+ untuk nilai >= 60
            System.out.println("Grade C+");
        } else if (nilai >= 50) {
            // Grade C untuk nilai >= 50
            System.out.println("Grade C");
        } else if (nilai >= 40) {
            // Grade D untuk nilai >= 40
            System.out.println("Grade D");
        } else {
            // Grade E untuk nilai < 40
            System.out.println("Grade E");
        }
    }
}

package ngoding;

import java.util.Scanner;

public class Day49 {

    public static void main(String[] args) {
        int[] angka = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke- " + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }
        // Menampilkan isi array 
        System.out.println("Isi array:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }
        // Mencari angkaTerbesar
        int angkaTerbesar = angka[0];
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > angkaTerbesar) {
                angkaTerbesar = angka[i];
            }
        }
        // Menampilkan angkaTerbesar
        System.out.println("Angka terbesar: " + angkaTerbesar);
    }
}

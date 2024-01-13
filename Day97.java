package ngoding;

import java.util.Scanner;

public class Day97 {

    public static void main(String[] args) {
        // Buat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);
        // Deklarasi matriks A dan B dengan ukuran 2x2
        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        // Membaca nilai elemen matriks A dari pengguna
        System.out.println("Masukan nilai matriks A:");
        // loop luar untuk mengulang setiap baris dari array 2D A
        for (int i = 0; i < A.length; i++) {
            // loop dalam untuk mengulang setiap elemen dalam satu baris
            for (int j = 0; j < A[i].length; j++) {
                // Prompt pengguna untuk memasukkan nilai untuk elemen saat ini
                System.out.print("A[" + i + "][" + j + "] = ");
                // Membaca nilai integer yang dimasukkan pengguna
                A[i][j] = input.nextInt();
            }
        }
        // Membaca nilai elemen matriks B dari pengguna
        System.out.println("Masukan nilai matriks B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = input.nextInt();
            }
        }
        // Melakukan perkalian matriks A dan B
        int[][] C = new int[A.length][B[0].length];  // Hasil perkalian A dan B
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                for (int k = 0; k < A[i].length; k++) {
                    // Perkalian elemen berdasarkan rumus perkalian matriks
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        // Menampilkan hasil perkalian matriks A dan B
        System.out.println("Hasil perkalian matriks A dan B:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}

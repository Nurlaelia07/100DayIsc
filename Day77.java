
package ngoding;

import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
        
        // Deklarasikan Scanner
        Scanner sc = new Scanner(System.in);

        // Deklarasikan array
        int[] array = new int[10];

        // Inputkan nilai array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Masukkan nilai ke-" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        // Hitung penjumlahan array
        int penjumlahan = 0;
        for (int i = 0; i < array.length; i++) {
            penjumlahan += array[i];
        }

        // Tampilkan hasil
        System.out.println("Hasil penjumlahan array adalah: " + penjumlahan);
    }
}

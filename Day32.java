package ngoding;

import java.util.Scanner;

public class Day32 {

    public static void main(String[] args) {
        int[] array = {7, 5, 3, 4, 23};
        // menampilkan isi Array menggunakan for Each
        System.out.println("Isi Array");
        for (int angka : array) {
            System.out.println(angka);
        }
        
        int jumlah = 0;
        for (int angka : array) {
            jumlah += angka;
        }
        System.out.println("Jumlah dari angka-angka dalam array adalah: " + jumlah);
    }

}

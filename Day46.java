package ngoding;

import java.util.Scanner;

public class Day46 {

    public static void main(String[] args) {
        int[] angka = new int[6];
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke- " + (i + 1) + ": ");
            Scanner sc = new Scanner(System.in);
            angka[i] = sc.nextInt();
        }
        System.out.print("Angka angka dalam array adalah : ");
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i] + " ");
        }
        int jumlah = 0;
        for (int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }
        System.out.println("\nJumlah dari semua angka adalah : " + jumlah);
    }
}

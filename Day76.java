package ngoding;

import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        // Deklarasikan Scanner
        Scanner sc = new Scanner(System.in);

        // Inputkan tiga  angka
        System.out.println("Masukkan angka pertama: ");
        int angka1 = sc.nextInt();

        System.out.println("Masukkan angka kedua: ");
        int angka2 = sc.nextInt();

        System.out.println("Masukkan angka ketiga: ");
        int angka3 = sc.nextInt();

        // Cek apakah pembagian angka pertama dan ketiga adalah pecahan
        if (angka1 / angka3 % 1 != 0) {
            
            System.out.println("Hasilnya adalah: 2");
        } else {
            
            System.out.println("Hasilnya adalah: " + (angka1 + angka2 - 2));
        }
    }
}

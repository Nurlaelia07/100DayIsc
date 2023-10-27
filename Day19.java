package ngoding;

import java.util.Scanner;

public class Day19 {
    public static void main(String[] args) {
        double alas, luas, tinggi;
        Scanner segitiga = new Scanner(System.in);
        System.out.print("Masukkan alas segitiga  : ");
        alas = segitiga.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        tinggi = segitiga.nextDouble();
        
        //Menghitung LUas Segiitiga
        luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga adalah " + luas);
    }
}

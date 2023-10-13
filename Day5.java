package ngoding;

import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        int nilai1, nilai2, hasil;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai 1 : ");
        nilai1 = input.nextInt();
        
        System.out.print("Masukkan nilai 2 : ");
        nilai2 = input.nextInt();
        
        //Operator Penjumlahan
        hasil = nilai1 + nilai2 ;
        System.out.println("Hasil Penjumlahan : " + hasil);
        //Operator Pengurangan
        hasil = nilai1 - nilai2;
        System.out.println("Hasil Pengurangan : " + hasil);
        //Operator Perkalian
        hasil = nilai1 * nilai2;
        System.out.println("Hasil Perkalian : " + hasil);
        // Operator pembagian
        hasil = nilai1 / nilai2;
        System.out.println("Hasil Pembagian : " + hasil);
        //Operator sisa bagi
        hasil = nilai1 % nilai2;
        System.out.println("Hasil Sisa bagi : " + hasil);
    }
}

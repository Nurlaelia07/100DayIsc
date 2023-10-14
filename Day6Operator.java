package ngoding;

import java.util.Scanner;

public class Day6Operator {
    public static void main(String[] args) {
        
        int nilai1, nilai2, hasil;
        boolean a, b, c;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai 1 : ");
        nilai1 = input.nextInt();
        
        System.out.print("Masukkan nilai 2 : ");
        nilai2 = input.nextInt();
        
        System.out.println("Operator Penugasan");
  
        //Operator Penugasan Tambah Sama Dengan
        hasil = nilai1 += nilai2 ;
        System.out.println("Hasil Tambah Sama Dengan    : " + hasil);
        //Operator Penugasan Kurang Sama Dengan
        hasil = nilai1 -= nilai2;
        System.out.println("Hasil Kurang Sama Dengan    : " + hasil);
        //Operator Penugasan Kali Sama Dengan
        hasil = nilai1 *= nilai2;
        System.out.println("Hasil Kali Sama Dengan      : " + hasil);
        // Operator Penugasan Bagi Sama Dengan
        hasil = nilai1 /= nilai2;
        System.out.println("Hasil Bagi Sama Dengan      : " + hasil);
        //Operator Penugasan Sisa Bagi Sama Dengan
        hasil = nilai1 %= nilai2;
        System.out.println("Hasil Sisa Bagi Sama Dengan : " + hasil);
        System.out.println();
        
        System.out.println("Operator Perbandingan");
        //Operator Perbandingan Sama Dengan
        System.out.println(nilai1 == nilai2 );
        //Operator Perbandingan Tidak Sama Dengan
        System.out.println(nilai1 != nilai2);
        //Operator Perbandingan Lebih Besar Dari
        System.out.println(nilai1 > nilai2);
        //Operator Perbandingan Lebih Kecil Dari
        System.out.println(nilai1 < nilai2);
        //Operator Perbandingan Lebih Besar Atau Sama Dengan
        System.out.println(nilai1 >= nilai2);
         //Operator Perbandingan Lebih Kecil Atau Sama Dengan
        System.out.println(nilai1 <= nilai2);
        System.out.println();
        
        System.out.println("Operator Logika");
        a = true;
        b = false;
        
        // Konjungsi (AND)
        c = a && b;
        System.out.println("true && false = " +c );
        
        // Disjungsi (OR)
        c = a || b;
        System.out.println("true || false = " + c);
        
        // Negasi (NOT)
        System.out.println("Negasi, !true = " +!a);
        System.out.println("Negasi, !false = " +!b);
    }
}

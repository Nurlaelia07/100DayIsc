package ngoding;

import java.util.Scanner;

public class Day37 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean jalan = true;
        while (jalan == true) {
            int hasil;
            System.out.println("Menu \n1. Pejumlahan \n2. Pengurangan \n3.  Keluar");
            System.out.print("Masukkan Angka 1 : ");
            int angka1 = sc.nextInt();
            System.out.print("Masukkan Angka 2 : ");
            int angka2 = sc.nextInt();

            System.out.print("Masukkan Menu yang ingin anda lakukan: ");
            int pilihan = sc.nextInt();
            if (pilihan == 1) {
                hasil = angka1 + angka2;
                System.out.println(hasil);
            } else if (pilihan == 2) {
                hasil = angka1 - angka2;
                System.out.println(hasil);
            } else if (pilihan == 3) {
                jalan = false;
            } else {
                System.out.println("Pilihan Tidak Valid");
            }
        }
    }

}

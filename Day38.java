package ngoding;

import java.util.ArrayList;
import java.util.Scanner;

public class Day38 {

    public static void main(String[] args) {
        int jumlah = 0;
        ArrayList Angka = new ArrayList(10);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan angka : ");
            int angka = sc.nextInt();
            Angka.add(angka);
            jumlah += angka;
            System.out.println(Angka);

        }
        System.out.println("Jmlah dari semua angka yang anda masukkan adalah : " + jumlah);
    }
}

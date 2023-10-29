package ngoding;

import java.util.Scanner;

public class Day21 {

    public static void main(String[] args) {

        // Scanner inputan
        Scanner isc = new Scanner(System.in);
        // Menerima inputan bil awal
        System.out.print("Masukkan bilangan awal: ");
        int bilanganAwal = isc.nextInt();
        // Menerima inputan bil akhir
        System.out.print("Masukkan bilangan akhir: ");
        int bilanganAkhir = isc.nextInt();
        // Mencetak bilangan dari bilangan awal sampai bilangan akhir
        for (int i = bilanganAwal; i <= bilanganAkhir; i++) {
            System.out.println(i);
            // Hasil outputnya yaitu misal kita memasukkan bil awal : 10, lalu 
            // bil akhir 20. maka hasilnya yaitu bilangan 10-20.
        }
    }
}

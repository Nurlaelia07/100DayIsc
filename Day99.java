package ngoding;

import java.util.Scanner;

public class Day99 {

    public static void main(String[] args) {
        // Deklarasi Scanner
        Scanner sc = new Scanner(System.in);
        // Deklarasi array
        String[] namaNamaMhsKpi = new String[5];
        // Menerima input dari pengguna
        for (int i = 0; i < namaNamaMhsKpi.length; i++) {
            System.out.print("Masukkan nama ke-" + (i + 1) + ": ");
            String namaLengkap = sc.nextLine();
            namaNamaMhsKpi[i] = namaLengkap;
        }
        // Menampilkan isi array
        for (String namaLengkap : namaNamaMhsKpi) {
            System.out.println(namaLengkap);
        }
        // Mencari nama yang paling panjang
        String namaPanjang = namaNamaMhsKpi[0];
        for (int i = 1; i < namaNamaMhsKpi.length; i++) {
            if (namaNamaMhsKpi[i].length() > namaPanjang.length()) {
                namaPanjang = namaNamaMhsKpi[i];
            }
        }
        System.out.println("Nama yang paling panjang adalah: " + namaPanjang);
    }
}

package ngoding;

import java.util.ArrayList;
import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        // Deklarasi variabel
        ArrayList<Integer> nilai = new ArrayList();
        int jumlah = 0;
        
        // Membaca input dari pengguna
        for (int i = 1; i <= 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan nilai : ");
            int nilai1 = sc.nextInt();
            // Menambahkan nilai1 input dari pengguna ke dalam ArrayList nilai
            nilai.add(nilai1);
            // Menambahkan nilai input dari pengguna ke dalam variabel jumlah
            jumlah += nilai1;
        }

        // Menampilkan hasil input
        System.out.println("Nilai : " + nilai);
        System.out.println("Jumlah : " + jumlah);

        // Menghapus nilai pada indeks ke-2
        nilai.remove(2);

        // Mengganti nilai pada indeks ke-1 dengan 21
        nilai.set(1, 21);

        // Menampilkan hasil perubahan
        System.out.println("Nilai : " + nilai);

        // Menambahkan nilai baru
        nilai.add(1);
        nilai.add(2);
        nilai.add(3);
        nilai.add(4);

        // Menampilkan nilai pada indeks ke-2
        System.out.println("Nilai pada indeks ke-2 : " + nilai.get(2));
    }
}

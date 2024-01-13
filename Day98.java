package ngoding;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day98 {

    public static void main(String[] args) {
        // Deklarasi variabel
        // Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);
        // Kata sandi yang akan diperiksa
        String kataSandi;
        // Deklarasi struktur data
        // Set untuk menyimpan huruf besar
        // Set adalah struktur data yang tidak memiliki elemen duplikat, sehingga cocok digunakan untuk menyimpan jenis-jenis karakter yang berbeda.
        Set<Character> hurufBesar = new HashSet<>();
        // Set untuk menyimpan huruf kecil
        Set<Character> hurufKecil = new HashSet<>();
        // Set untuk menyimpan angka
        Set<Character> angka = new HashSet<>();
        // Set untuk menyimpan simbol
        Set<Character> simbol = new HashSet<>();
        // Minta input kata sandi 
        System.out.print("Masukkan kata sandi: ");
        kataSandi = input.nextLine();
        // Analisis kata sandi
        // Perulangan untuk setiap karakter dalam kata sandi
        for (int i = 0; i < kataSandi.length(); i++) {
            // Dapatkan karakter pada indeks i
            char karakter = kataSandi.charAt(i);
            // Masukkan karakter ke dalam set yang sesuai
            if (karakter >= 'A' && karakter <= 'Z') {
                hurufBesar.add(karakter);
            } else if (karakter >= 'a' && karakter <= 'z') {
                hurufKecil.add(karakter);
            } else if (karakter >= '0' && karakter <= '9') {
                angka.add(karakter);
            } else {
                simbol.add(karakter);
            }
        }
        // Tetapkan skor kekuatan kata sandi
        // Skor 1 untuk setiap jenis karakter yang ada
        int skorKekuatan = 0;
        if (kataSandi.length() >= 8) {
            skorKekuatan += 1;
        }
        skorKekuatan += hurufBesar.size() + hurufKecil.size() + angka.size() + simbol.size();
        // Tampilkan hasil
        System.out.println("Kekuatan kata sandi: " + skorKekuatan);
        // Kata sandi dengan skor 4 atau lebih dianggap kuat dan Kata sandi dengan skor kurang dari 4 disarankan untuk ditingkatkan
        if (skorKekuatan < 4) {
            System.out.println("Saran:");
            System.out.println("- Pastikan kata sandi memiliki panjang minimal 8 karakter");
            System.out.println("- Pastikan kata sandi mengandung campuran huruf besar, huruf kecil, angka, dan simbol");
        }
    }
}

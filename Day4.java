package ngoding;

import java.util.Scanner;

public class Day4 {

    public static void main(String[] args) {
        // Inputan menggunakan Scanner (Mengambil input dari pengguna)
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama depan Anda: ");
        // Membaca masukan berupa string dari pengguna untuk nama depan
        String namaDepan = input.nextLine();
        System.out.print("Masukkan nama belakang Anda: ");
        // Membaca masukan berupa string dari pengguna untuk nama belakang
        String namaBelakang = input.nextLine();
        System.out.println("Hai " + namaDepan + namaBelakang + " Selamat Bergabung di Isc ");
        System.out.print("Masukkan umur anda : ");
        // Membaca masukan berupa int (umur) dari pengguna
        int umur = input.nextInt();
        System.out.print("Masukkan tinggi badan anda : ");
        // Membaca masukan berupa int (tinggi badan ) dari pengguna
        int tinggiBadan = input.nextInt();
        System.out.println("Selamat anda sudah berusia " + umur + " tahun " + "dan tinggi badan anda " + tinggiBadan + " Cm");
        
        
        

    }
}

package ngoding;

import java.util.Scanner;

public class Day81 {

    public static void main(String[] args) {

        // Meminta user memasukkan nilai rusuk kubus
        System.out.print("Masukkan nilai Rusuk Kubus : ");
        Scanner sc = new Scanner(System.in);
        int Rusuk = sc.nextInt();
        //Menghitung luas kubus dengan memanggil fungsi luasKubus()
        luasKubus(Rusuk);
        // Menampilkan hasil perhitungan luas kubus
        System.out.println("Luas Kubus adalah : " + luasKubus(Rusuk));
        // Menghitung volume kubus dengan memanggil fungsi volumeKubus()
        volumeKubus(Rusuk);
        // Menampilkan hasil perhitungan volume kubus
        System.out.println("Volume Kubus adalah : " + volumeKubus(Rusuk));
    }

    // Fungsi untuk menghitung luas kubus
    public static int luasKubus(int rusuk) {
        // Menghitung luas kubus
        int luasKubus1 = 6 * rusuk * rusuk;
        // Mengembalikan hasil perhitungan luas kubus
        return luasKubus1;
    }

    // Fungsi untuk menghitung volume kubus
    public static int volumeKubus(int rusuk) {
        // Menghitung volume kubus
        int volumeKubus2 = rusuk * rusuk * rusuk;
        // Mengembalikan hasil perhitungan volume kubus
        return volumeKubus2;
    }
}

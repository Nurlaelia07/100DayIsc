package ngoding;

import java.util.Scanner;

public class Day56 {

    public static void main(String[] args) {
        // Buat array dengan nama , nim, alamat dan mataKuliah
        // yang berukuran 5 atau isinya 5.
        
        String[] nama = new String[5];
        String[] nim = new String[5];
        String[] alamat = new String[5];
        String[] mataKuliah = new String[5];

        // Input data
        Scanner input = new Scanner(System.in);
        // for digunakan untuk membaca input sebanyak 5 kali, lalu setiap iterasi
        // data nama, nim ,alamat dan mata kuliah dibaca dan disimpan kedalam variabel yang sesuai.
        for (int i = 0; i < nama.length; i++) {
            System.out.print("Masukan nama mahasiswa ke-" + (i + 1) + ": ");
            nama[i] = input.nextLine();

            System.out.print("Masukan nim mahasiswa ke-" + (i + 1) + ": ");
            nim[i] = input.nextLine();

            System.out.print("Masukan alamat mahasiswa ke-" + (i + 1) + ": ");
            alamat[i] = input.nextLine();

            System.out.print("Masukan mata kuliah yang diambil mahasiswa ke-" + (i + 1) + ": ");
            mataKuliah[i] = input.nextLine();
        }

        // Menampilkan data mahasiswa semester 5
        System.out.println("Data mahasiswa semester 5");
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Nama Mahasiswa  : " + nama[i]);
            System.out.println("NIM             : " + nim[i]);
            System.out.println("Alamat          : " + alamat[i]);
            System.out.println("Mata kuliah     : " + mataKuliah[i]);
        }
    } 
}

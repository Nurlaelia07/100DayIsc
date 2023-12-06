package ngoding;

import java.util.TreeSet;

public class Day59 {

    public static void main(String[] args) {
        //TreeSet adalah struktur data yang menyimpan data dalam urutan terurut. 
        //Data pada TreeSet diurut berdasarkan nilai data tersebut.
        // Buat objek TreeSet dengan tipe data String
        TreeSet<String> perusahaanIT = new TreeSet<>();

        // Menambahkan elemen ke Tree
        perusahaanIT.add("PT. Indosat Ooredoo");
        perusahaanIT.add("PT. Telkom Indonesia");
        perusahaanIT.add("PT. Saumata Teknosains Globa");
        perusahaanIT.add("PT. Rekind Daya Mamuju, Pembangkit Listrik Tenaga Uap (PLTU)");
        perusahaanIT.add("PT. PLN (Persero) UP3 Mamuju");

        // Memanggil method `tampilkanPerusahaan()`
        tampilkanPerusahaan(perusahaanIT);
    }

    // Method untuk menampilkan data nama-nama perusahaan
    public static void tampilkanPerusahaan(TreeSet<String> perusahaan) {
        //Menggunakan looping `for` untuk menampilkan data nama-nama perusahaan di `TreeSet`
        for (String namaPerusahaan : perusahaan) {
            System.out.println(namaPerusahaan);
        }
    }
}

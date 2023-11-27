package ngoding;

import java.util.HashSet;

public class Day50 {
    public static void main(String[] args) {
        // Struktur Data HashSet digunakan untuk menyimpan kumpulan item yang setiap
        // Item dalam kumpulan data tersebut bersifat unik (tidak ada yang sama).
        // Deklarasi dan inisialisasi variabel buah
        HashSet<String> buah = new HashSet<String>();
        // Menambahkan item ke dalam HashSet menggunakan add.
        buah.add("Rambutan");        
        buah.add("Apel");
        buah.add("Jeruk");
        buah.add("Stroberi");
        buah.add("Anggur");
        buah.add("Melon");
        buah.add("Melon");
        // buah.add("Melon") hanya satu yang terbaca dikarenakan sudah ada data yang sama tersimpan
        // lebih dulu dan semua item di HashSet harus unik.
         // Mencetak output / menampilkan nama -  nama buah yang telah ditambahkan
        System.out.println("Nama - Nama Buah : " + buah);
        
    }
}

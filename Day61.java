package ngoding;

import java.util.Scanner;

public class Day61 {

    public static void main(String[] args) {

        // Program ini menggunakan array untuk menyimpan nama-nama alat tulis. 
        // Array alat tulis diinisialisasi dengan 10 buah nama alat tulis.
        // Deklarasi array alat tulis dengan 10 buah nama alat tulis
        String[] alatTulis = {"Pensil", "Pulpen", "Penghapus", "Buku", "Map", "Lem", "Penggaris", "Rautan", "Tempat pensil", "Kertas"};

        // Deklarasi variabel tidakAda untuk menyimpan status apakah alat tulis yang dicari ada atau tidak
        boolean tidakAda = true;

        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner isc = new Scanner(System.in);
        // Menampilkan pesan untuk meminta input dari pengguna
        System.out.print("Alat tulis apa yang anda cari : ");
        // Membaca input dari keyboard dan menyimpannya ke dalam variabel cari
        String cari = isc.nextLine();
        // Perulangan untuk memeriksa setiap alat tulis di array
        for (int i = 0; i < alatTulis.length; i++) {

            // Percabangan untuk memeriksa apakah nama alat tulis yang dicari sama dengan nama alat tulis di array
            if (alatTulis[i].equalsIgnoreCase(cari)) {

                // Menampilkan pesan jika alat tulis yang dicari ada
                System.out.println("Alat tulis " + alatTulis[i] + " ada di rak nomor " + i);

                // Mengubah nilai variabel tidakAda menjadi false untuk menunjukkan bahwa alat tulis yang dicari ada
                tidakAda = false;
            }
        }

        // Percabangan untuk memeriksa apakah nilai variabel tidakAda masih true
        if (tidakAda) {
            // Menampilkan pesan jika alat tulis yang dicari tidak ada
            System.out.println("Alat tulis " + cari + " tidak ada di rak");
        }
    }
}

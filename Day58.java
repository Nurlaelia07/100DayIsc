package ngoding;

import java.util.HashMap;

public class Day58 {

    public static void main(String[] args) {
        
        /*
        Program ini merupakan contoh penggunaan kelas HashMap untuk menyimpan data daftar riwayat hidup.
        Kelas HashMap merupakan salah satu kelas dari Java Collections Framework yang digunakan untuk menyimpan data dalam bentuk pasangan kunci-nilai.
        Pada program ini, data daftar riwayat hidup disimpan dalam HashMap dengan kunci berupa nama field dan nilai berupa nilai field.
        Untuk menampilkan data dari daftar riwayat hidup, digunakan metode get() dari kelas HashMap.
        */
        // Membuat objek HashMap untuk menyimpan data daftar riwayat hidup
        HashMap<String, String> biodata = new HashMap<>();

        // Menambahkan data ke dalam HashMap
        biodata.put("Nama", "Nurlaelia");
        biodata.put("NIM", "D0221099");
        biodata.put("TempatTanggalLahir", "Laliko, 7 Mei 2003");
        biodata.put("TahunAngkatan", "2021");
        biodata.put("Jurusan", "Informatika");
        biodata.put("Fakultas", "Teknik ");
        biodata.put("Email", "nurlayliapolman@gmail.com");

        // Menampilkan data dari daftar riwayat hidup
        System.out.println("Data dari daftar riwayat hidup:");
        System.out.println("Nama                : " + biodata.get("Nama"));
        System.out.println("NIM                 : " + biodata.get("NIM"));
        System.out.println("Tempat Tanggal Lahir: " + biodata.get("TempatTanggalLahir"));
        System.out.println("Tahun Angkatan      : " + biodata.get("TahunAngkatan"));
        System.out.println("Jurusan             : " + biodata.get("Jurusan"));
        System.out.println("Fakultas            : " + biodata.get("Fakultas"));
        System.out.println("Email               : " + biodata.get("Email"));
    }

    // Fungsi untuk mengubah huruf menjadi kapital
    private static String ubahHurufKapital(String string) {
        return string.toUpperCase(); // Mengubah huruf menjadi kapital
    }
}

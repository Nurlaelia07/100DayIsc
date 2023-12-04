package ngoding;

import java.util.Queue;
import java.util.LinkedList;

public class Day57 {
    //Kelas Day57 merupakan kelas utama yang menjalankan program

    public static void main(String[] args) {
        //Queue adalah struktur data yang menyimpan data dalam urutan FIFO (First In First Out). 
        //Data yang pertama kali dimasukkan akan menjadi data yang pertama kali dikeluarkan.
        // Kelas Mahasiswa mewakili data mahasiswa yang disimpan di dalam Queue. Kelas ini memiliki tiga atribut, yaitu nama, nim, dan prodi.

        // Membuat objek Queue menggunakan implementasi LinkedList
        Queue<Mahasiswa> queue = new LinkedList<>();

        // Menambahkan data ke antrian menggunakan metode add()
        // Menambahkan objek Mahasiswa dengan nama "Nurlaelia", NIM "D0221099", dan prodi "Teknik Informatika"
        queue.add(new Mahasiswa("Nurlaelia", "D0221099", "Teknik Informatika"));
        // Menambahkan objek Mahasiswa dengan nama "Eunike Dukkun", NIM "D0221354", dan prodi "Teknik Informatika"
        queue.add(new Mahasiswa("Eunike Dukkun", "D0221354", "Teknik Informatika"));
        // Menambahkan objek Mahasiswa dengan nama "Arya Samudra", NIM "D0221357", dan prodi "Teknik Informatika"
        queue.add(new Mahasiswa("Arya Samudra", "D0221357", "Teknik Informatika"));

        // Menampilkan data dari antrian
        System.out.println("Data dari Queue Mahasiswa : ");
        // Berulang hingga antrian kosong
        while (!queue.isEmpty()) {
            // Mencetak elemen di depan antrian dan menghapusnya menggunakan metode poll()
            System.out.println(queue.poll());
        }
    }
}
// Membuat kelas bernama Mahasiswa untuk mewakili seorang mahasiswa

class Mahasiswa {

    // Mendeklarasikan atribut pribadi bernama nama untuk menyimpan nama mahasiswa
    private String nama;
    // Mendeklarasikan atribut pribadi bernama nim untuk menyimpan NIM mahasiswa
    private String nim;
    // Mendeklarasikan atribut pribadi bernama prodi untuk menyimpan program studi mahasiswa
    private String prodi;

    // Konstruktor untuk menginisialisasi atribut mahasiswa
    public Mahasiswa(String nama, String nim, String prodi) {
        // Mengatur nama mahasiswa, Nim dan Program studi
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    // Metode getter untuk mengembalikan nama mahasiswa
    public String getNama() {
        return nama;
    }

    // Metode setter untuk mengatur nama mahasiswa
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Metode getter untuk mengembalikan NIM mahasiswa
    public String getNim() {
        return nim;
    }

    // Metode setter untuk mengatur NIM mahasiswa
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Metode getter untuk mengembalikan program studi mahasiswa
    public String getProdi() {
        return prodi;
    }

    // Metode setter untuk mengatur program studi mahasiswa
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    @Override // Mengganti metode toString() untuk memberikan representasi yang bermakna dari objek mahasiswa
    public String toString() {
        return "Nama: " + nama + ", NIM: " + nim + ", Prodi: " + prodi;
    }
}

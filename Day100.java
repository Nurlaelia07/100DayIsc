package ngoding;
import java.util.Scanner;
public class Day100 {
    public static void main(String[] args) {
        // Deklarasi Scanner untuk membaca input 
        Scanner sc = new Scanner(System.in);
        // Deklarasi variabel untuk menyimpan nama 
        String nama;
        // Deklarasi variabel untuk menyimpan nilai boolean yang menunjukkan apakah pengguna ingin memasukkan transaksi lagi
        boolean ulang;
        // Menerima input dari pengguna dan Perulangan untuk setiap transaksi
        do {
            // Menerima nama orang yang melakukan transaksi
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            // Menerima pemasukan
            System.out.print("Masukkan pemasukan: ");
            int pemasukan = sc.nextInt();
            // Menerima pengeluaran
            System.out.print("Masukkan pengeluaran: ");
            String pengeluaran = sc.next();
            int pengeluaranInt = Integer.parseInt(pengeluaran);
            // Menerima kategori pengeluaran
            System.out.print("Masukkan kategori pengeluaran: ");
            String kategori = sc.next();
            // Membuat objek transaksi baru
            Transaksi transaksi = new Transaksi(pemasukan, pengeluaranInt,kategori);
            // Menampilkan hasil
            System.out.println("Pemasukan: " + transaksi.pemasukan);
            System.out.println("Pengeluaran: " + transaksi.pengeluaran);
            System.out.println("Saldo: " + transaksi.saldo);
            System.out.println("Kategori: " + transaksi.kategori);
            // Menerima input dari pengguna
            System.out.print("Ingin memasukkan transaksi lagi (Y/N)? ");
            String input = sc.next();
            ulang = input.equalsIgnoreCase("Y");
            sc.nextLine();
        } while (ulang);
        System.out.println("Terima kasih telah menggunakan program ini!");
    }
    static class Transaksi {
        // Atribut pemasukan
        int pemasukan;
        // Atribut pengeluaran
        int pengeluaran;
        // Atribut saldo
        int saldo;
        // Atribut kategori pengeluaran
        String kategori;
        // Konstruktor untuk membuat objek transaksi baru
        public Transaksi(int pemasukan, int pengeluaran, String kategori) {
            // Menginisialisasi atribut pemasukan
            this.pemasukan = pemasukan;
            // Menginisialisasi atribut pengeluaran
            this.pengeluaran = pengeluaran;
            // Menghitung saldo
            this.saldo = pemasukan - pengeluaran;
            // Menginisialisasi atribut kategori pengeluaran
            this.kategori = kategori;
        }
    }
}

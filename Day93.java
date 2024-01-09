package ngoding;

public class Day93 {

    // Kelas Day93 mendefinisikan sebuah objek manusia
    // dengan dua field, nama dan usia
    // kelas Day93 merupakan kelas publik, artinya dapat diakses dari luar kelas.
    // Field nama Menyimpan nama manusia tersebut.
    public String nama;
    // Field usia Menyimpan usia manusia tersebut.
    public int usia;
    // Constructor Day93 menginisialisasi field nama dan usia.
    public Day93(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }
    // Method menyapa mencetak pesan "Halo, nama saya adalah [nama] dan usia saya [usia] tahun".
    public void menyapa() {
        System.out.println("Halo, nama saya adalah " + nama + " dan usia saya " + usia + " tahun");
    }
    // Inner class Alamat mendefinisikan sebuah objek alamat.
    class Alamat {
        // Field jalan
        // Menyimpan nama jalan.
        public String jalan;
        // Field kota
        // Menyimpan nama kota.
        public String kota;
        // Field negara bagian
        // Menyimpan nama negara bagian.
        public String negaraBagian;
        // Field kode pos
        // Menyimpan kode pos.
        public String kodePos;
    }
    // Method main menciptakan objek Day93 bernama Nurlaelia.
    public static void main(String[] argumen) {
        Day93 nurlaelia = new Day93("Nurlaelia", 20);
        // Method main memanggil method menyapa() pada objek nurlelia.
        nurlaelia.menyapa();
        // Method main menciptakan objek Alamat bernama alamat.
        Day93.Alamat alamat = nurlaelia.new Alamat();
        // Method main menginisialisasi field alamat.
        alamat.jalan = "Jl. Poros Majene";
        alamat.negaraBagian = "Indo";
        alamat.kodePos = "91353";
        // Method main memeriksa apakah nurlaelia merupakan instance dari kelas Day93.
        if (nurlaelia instanceof Day93) {
            System.out.println("nurlaelia adalah instance dari kelas Day93");
        }
    }
}

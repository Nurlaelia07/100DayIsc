package ngoding;

public class Day2 {
    public static void main(String[] args) {
        System.out.println("========= PRIMITIF =========");
        // Deklarasi tipe data primitif
        int nimAkhir;       // Integer
        char kelas;         // Character
        byte umur;          // Byte
        short angkatan;     // Short
        float beratBadan;   // Float
        double tinggiBadan; // Double
        boolean mahasiswa;  // Boolean
        long tahunLahir;    // Long

        // Inisialisasi variabel dengan nilai
        nimAkhir = 1099;
        kelas = 'G';
        umur = 19;
        angkatan = 2021;
        beratBadan = 40.0f;   // Harus disertakan "f" di akhir nilai float.
        tinggiBadan = 160.0;
        mahasiswa = true;
        tahunLahir = 2004;

        // Menampilkan nilai dari tipe data primitif
        System.out.println("Nim saya D022" + nimAkhir);
        System.out.println("Saya adalah angkatan " + angkatan + " kelas " + kelas);
        System.out.println("Saya berumur " + umur + " tahun dengan tinggi badan " + tinggiBadan + " cm dan " + mahasiswa + " saya adalah mahasiswa");
        System.out.println("Berat badan saya adalah " + beratBadan + " kg");

        System.out.println("\n======== NON PRIMITIF ========");
        // Deklarasi tipe data non-primitif (Reference)
        String nama;             // String
        Integer nim2;            // Integer (Autoboxing)
        Character kelas2;        // Character
        Boolean mahasiswa2;      // Boolean (Autoboxing)
        Float tinggi_badan;      // Float (Autoboxing)
        Byte tanggal_lahir;      // Byte (Autoboxing)
        Short bulan_lahir;       // Short (Autoboxing)
        Long tahun_lahir;        // Long (Autoboxing)
        Double berat_badan2;     // Double (Autoboxing)

        // Inisialisasi variabel dengan nilai
        nama = "Nurlaelia";
        nim2 = 221099;
        kelas2 = 'G';
        mahasiswa2 = true;
        tinggi_badan = 160.2f;
        tanggal_lahir = 24;
        bulan_lahir = 3;
        tahun_lahir = 2004L; // Anda perlu menambahkan "L" pada akhir nilai long.
        berat_badan2 = 40.0;

        // Menampilkan nilai dari tipe data non-primitif
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim2);
        System.out.println("Kelas : " + kelas2);
        System.out.println("Status : " + mahasiswa2);
        System.out.println("Tinggi badan : " + tinggi_badan);
        System.out.println("Tanggal lahir : " + tanggal_lahir);
        System.out.println("Bulan lahir : " + bulan_lahir);
        System.out.println("Tahun lahir : " + tahun_lahir);
        System.out.println("Berat badan : " + berat_badan2 + " kg");
    }
    // Tipe data primitif, seperti int atau double, digunakan untuk menyimpan nilai tunggal seperti angka atau desimal.
    // Tipe data non-primitif, seperti String atau ArrayList, digunakan untuk menyimpan objek yang dapat berisi banyak nilai dan memiliki metode untuk memanipulasi objek tersebut.
}

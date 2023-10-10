package ngoding;
public class Day2 {
    public static void main(String[] args) {
        System.out.println("========= PRIMITIF =========");
        // Tipe data primitif hanya dapat menyimpan satu nilai pada satu waktu
        //dan tidak dapat diubah menggunakan cara yang sama seperti tipe data
        //non-primitif. Tipe data Primitif akan dianggap sama jika nilainya sama.
        
        int nimAkhir;
        char kelas;
        byte umur;
        short angkatan;
        float beratBadan;
        double tinggiBadan;
        boolean mahasiswa;
        long tahunLahir;
        
        // Inisialisasi variabel dengan nilai tipe data non-primitf
        nimAkhir = 1099;
        kelas = 'G';
        umur = 19;
        angkatan = 2021;
        beratBadan = 40.0f; //Harus disertakan "f" di akhir nilai float.
        tinggiBadan = 160.0;
        mahasiswa = true;
        tahunLahir = 2004;
        
        
        
        // Menampilkan nilai dari tipe data primitif
        System.out.println("Nim saya D022"+nimAkhir);
        System.out.println("Saya adalah angkatan " + angkatan + " kelas " + kelas);
        System.out.println("Saya berumur " + umur + " tahun dengan tinggi badan " + tinggiBadan + " cm dan " + mahasiswa + " saya adalah mahasiswa");
        System.out.println("Berat badan saya adalah " + beratBadan );
        
        
        System.out.println("\n======== NON PRIMITIF ========");
        //Tipe data non-primitif  dapat menyimpan lebih dari satu nilai pada satu waktu dan dapat diubah.
        //Tipe data non-primitif akan dianggap berbeda meskipun nilainya sama dan dalam urutan yang sama.      
        String nama;
        int nim2;
        char kls;
        boolean mahasiswa2;
        float tinggi_badan;
        byte tanggal_lahir;
        short bulan_lahir;
        long tahun_lahir;
        double berat_badan;
        
        nama = "Nurlaelia";
        nim2 = 221099;
        kls = 'G';
        mahasiswa2 = true;
        tinggi_badan = 70.2f;
        tanggal_lahir = 24;
        bulan_lahir = 3;
        tahun_lahir = 2003;
        berat_badan = 124;
        
        System.out.println("Nama :" + nama);
        System.out.println("Nim :" + nim2);
        System.out.println("Kelas : " + kls);
        System.out.println("Status : " + mahasiswa2);
        System.out.println("tinngi_badan : " + tinggi_badan);
        System.out.println("tanggal_lahir : " + tanggal_lahir);
        System.out.println("Bulan lahir : " + bulan_lahir);
        System.out.println("Tahun_lahir : " + tahun_lahir);
        System.out.println("Berat_badan : " + berat_badan + "kg");
        
        
 
        
    }
}


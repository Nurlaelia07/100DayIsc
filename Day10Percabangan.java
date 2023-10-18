package ngoding;

public class Day10Percabangan {

    public static void main(String[] args) {
        //Buatlah program untuk menentukan  gaji karyawan, sesuai dengan golongan. 
        //Golongan I : 4.000.000, Golongan II : 7.000.000, Golongan III: 10.000.000.
        //Dan jika lama kerja Karyawan lebih dari 5 tahun maka akan mendapatkan bonus 100.000/tahun. 
        //Jdi bonusnya itu dikali dengan lama kerja.

        String golongan = "2"; // Ganti dengan golongan karyawan, misal disini saya menggunakan golongan 2.
        int lamaKerja = 6; // Ganti dengan lama kerja karyawan dalam tahun, misal disini karyawannya sudah bekerja selama 6 tahun.
        double gajiPokok = 7000000; // Ganti dengan gaji pokok karyawan, sesuai dengan golongan.

        // untuk menentukan besaran bonus berdasarkan lama kerja
        double bonus = 0;
        if (lamaKerja > 5) {
            bonus = lamaKerja * 100000; // bonus 100000 per tahun.
        }

        // menghitung gaji total
        double gajiTotal = gajiPokok + bonus;

        // Cetak hasil
        System.out.println("Golongan    : " + golongan);
        System.out.println("Lama Kerja  : " + lamaKerja + " tahun");
        System.out.println("Gaji Pokok  : " + gajiPokok);
        System.out.println("Bonus       : " + bonus);
        System.out.println("Gaji Total  : " + gajiTotal);

    }

}

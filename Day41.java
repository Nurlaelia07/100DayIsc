package ngoding;

import java.util.Scanner;

public class Day41 {

    public static void main(String[] args) {
        int jumlahTidakHadir, potongan, gaji, gajiBersih, pajak;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah tidak hadir pegawai : ");
        int jumlahTidakHadirPegawai = input.nextInt();
        int besaranGajiBulanan = 5000_000;
        jumlahTidakHadir = 30 - jumlahTidakHadirPegawai;
        if (jumlahTidakHadirPegawai > 3) {
            potongan = 25_000 * jumlahTidakHadirPegawai;
            gaji = besaranGajiBulanan - potongan;
            System.out.println("gaji pegawai adalah : " + gaji);
            pajak = gaji * 5 / 100;
            gajiBersih = gaji - pajak;
            System.out.println("Gaji Bersih Pegawai : " + gajiBersih);
        }
    }
}

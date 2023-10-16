package ngoding;

import java.util.Scanner;

public class Day8 {

    public static void main(String[] args) {
        int skor;
        String nilai;
        Scanner input = new Scanner(System.in);
        // Percabangan if-else if - else (Memiliki lebih dari 2 pilihan )
        System.out.println("Selamat Datang di Program Penghitungan Nilai Ujian");
        System.out.print("Masukkan skor ujian anda : ");
        skor = input.nextInt();
        if (skor >= 85 && skor <= 100) {
            nilai = "A (Sangat Baik)";
        } else if (skor >= 80 && skor < 85) {
            nilai = "A- (Baik)";
        } else if (skor >= 75 && skor < 80) {
            nilai = "B+ (Cukup Baik)";
        } else if (skor >= 70 && skor < 75) {
            nilai = "B (Cukup baik)";
        } else if (skor >= 65 && skor < 70) {
            nilai = "B- (Cukup)";
        } else if (skor >= 50 && skor < 65) {
            nilai = "C (Kurang)";
        } else if (skor >= 40 && skor < 50) {
            nilai = "D (Sangat Kurang)";
        } else {
            nilai = "E (Tidak Lulus)";
        }

        System.out.println("Skor Anda           : " + skor);
        System.out.println("Nilai Anda adalah " + nilai);
        System.out.println("Terima Kasih telah menggunakan program ini");

    }
}

package ngoding;

import java.util.Scanner;

public class Day27 {

    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Menu Makanan:");
            System.out.println("1. Nasi Goreng  : Rp 20,000");
            System.out.println("2. Mie Goreng   : Rp 18,000");
            System.out.println("3. Ayam Goreng  : Rp 25,000");
            System.out.println("4. Keluar");
            System.out.print("Masukkan nomor menu yang ingin dipesan (1/2/3/4): ");
            pilihan = isc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memesan Nasi Goreng seharga Rp 20,000");
                    break;
                case 2:
                    System.out.println("Anda memesan Mie Goreng seharga Rp 18,000");
                    break;
                case 3:
                    System.out.println("Anda memesan Ayam Goreng seharga Rp 25,000");
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }

            if (pilihan != 4) {
                System.out.print("Apakah Anda ingin memesan lagi? (ya/tidak): ");
                String jawaban = isc.next();
                if (jawaban.equalsIgnoreCase("tidak")) {
                    System.out.println("Terima kasih!");
                    break;
                }
            }
        } while (pilihan != 4);
    }

}

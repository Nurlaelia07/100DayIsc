package ngoding;

import java.util.Scanner;

public class Day7 {

    public static void main(String[] args) {

        int usia, skor;
        String nama, nilai, lampu;

        Scanner input = new Scanner(System.in);
        //Percabangan If (Hanya memiliki satu pilihan)
        System.out.println("Percabangan if");
        System.out.print("Masukkan Umur anda: ");
        usia = input.nextInt();
        if (usia < 17) {
            System.out.println("Anda masih dibawah umur / belum bisa membuat ktp");
        }
        System.out.println("Terima kasih");
        System.out.println();

        //Percabangan if else (Percabangan yang memiliki pilhan jika kondisinya salah)
        System.out.println("Percabangan if-else ");
        input.nextLine(); // Baca karakter baris baru
        System.out.print("Masukkan nama anda : ");
        nama = input.nextLine();
        System.out.print("Masukkan skor atau nilai anda : ");
        skor = input.nextInt();
        if (skor >= 80) {
            System.out.println("Wah Selamat " + nama + ", Anda Lulus ");
        } else {
            System.out.println("Maaf " + nama + ", Anda tidak lulus");
        }
        System.out.println();

        // Percabangan if-else if (Memiliki lebih dari 2 pilihan )
        System.out.println("Percabangan if-else if - else");
        System.out.print("Masukkan skor ujian anda : ");
        skor = input.nextInt();
        if (skor >= 90) {
            nilai = "A";
        } else if (skor >= 80) {
            nilai = "B+";
        } else if (skor >= 70) {
            nilai = "B";
        } else if (skor >= 60) {
            nilai = "B-";
        } else if (skor >= 50) {
            nilai = "C";
        } else if (skor >= 40) {
            nilai = "D";
        } else {
            nilai = "E";
        }
        System.out.println("Nilai Anda adalah " + nilai);
        System.out.println();

        //Percabangan switch/case
        System.out.println("Percabangan switch-case");
        input.nextLine(); // Baca karakter baris baru
        System.out.print("Masukkan nama warna : ");
        lampu = input.nextLine();
        switch (lampu) {
            case "merah":
                System.out.println("Lampu merah. Berhenti!");
                break;

            case "kuning":
                System.out.println("Lampu kuning. Hati-hati!");
                break;

            case "hijau":
                System.out.println("Lampu hijau. silahkan jalan!");
                break;

            default: // untuk memberitahu jika warna yang dimasukan salah
                System.out.println("Lampu salah");

        }

    }

}

package ngoding;

import java.util.Scanner;

public class Day9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Contoh Percabangan switch-case");
        System.out.print("Masukkan nama bulan dalam bahasa indonesia atau menggunakan angka : ");
        String bulan = input.nextLine();

        switch (bulan) {
            case "januari":
            case "1":
                System.out.println("Jumlah hari di bulan Januari adalah 31.");
                break;
            case "februari":
            case "2":
                System.out.println("Jumlah hari di bulan Februari adalah 28 atau 29.");
                break;
            case "maret":
            case "3":
                System.out.println("Jumlah hari di bulan Maret adalah 31.");
                break;
            case "april":
            case "4":
                System.out.println("Jumlah hari di bulan April adalah 30.");
                break;
            case "mei":
            case "5":
                System.out.println("Jumlah hari di bulan Mei adalah 31.");
                break;
            case "juni":
            case "6":
                System.out.println("Jumlah hari di bulan Juni adalah 30.");
                break;
            case "juli":
            case "7":
                System.out.println("Jumlah hari di bulan Juli adalah 31.");
                break;
            case "agustus":
            case "8":
                System.out.println("Jumlah hari di bulan Agustus adalah 31.");
                break;
            case "september":
            case "9":
                System.out.println("Jumlah hari di bulan September adalah 30.");
                break;
            case "oktober":
            case "10":
                System.out.println("Jumlah hari di bulan Oktober adalah 31.");
                break;
            case "november":
            case "11":
                System.out.println("Jumlah hari di bulan November adalah 30.");
                break;
            case "desember":
            case "12":
                System.out.println("Jumlah hari di bulan Desember adalah 31.");
                break;
            default:
                System.out.println("Bulan yang Anda masukkan tidak valid.");
        }
    }
}

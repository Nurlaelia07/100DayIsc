package ngoding;

import java.util.Scanner;

public class Day11 {

    public static void main(String[] args) {
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Bakso", "Es Teh", "Es Jeruk", "Es Nutrisari"}; // Daftar Menu makanan
        int[] harga = {12000, 14000, 12000, 5000, 5000, 3000}; // Daftar Harga Makanan

        int minOrder = 1;

        System.out.println("Daftar Menu Makanan");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i] + " : Rp " + harga[i]);
        }

        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan menu yang ingin anda pesan : ");
        int menuPesanan = input.nextInt(); // input menu yang dipesan
        System.out.print("Masukkan jumlah pesanan : ");
        int jumlahPesanan = input.nextInt(); // input jumlah menu yang dipesan

        if (jumlahPesanan < minOrder) {
            System.out.println("Jumlah pesanan harus lebih atau sama dengan " + minOrder);
        }
        int totalHarga = harga[menuPesanan - 1] * jumlahPesanan;

        System.out.println("Pesanan Anda    : ");
        System.out.println(menu[menuPesanan - 1] + " : " + jumlahPesanan);
        System.out.println("Total harga : Rp. " + totalHarga);
    }

}

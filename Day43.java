package ngoding;

import java.util.Scanner;

public class Day43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang tanah : ");
        double panjangTanah = sc.nextInt();
        System.out.print("Masukkan lebar tanah : ");
        double lebarTanah = sc.nextInt();
        System.out.println(Hargatanah(panjangTanah, lebarTanah));

    }

    public static int Hargatanah(double panjang, double lebar) {
        double hargaTanahPermeter = 500_000;
        double Hargatanah = panjang * lebar * hargaTanahPermeter;
        return (int) Hargatanah;

    }

}

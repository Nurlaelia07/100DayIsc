package ngoding;

import java.util.Scanner;

public class Day30 {

    public static void main(String[] args) {

        int panjang, lebar;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi panjang : ");
        panjang = sc.nextInt();

        System.out.print("Masukkan lebar persegi panjang : ");
        lebar = sc.nextInt();

        int luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah : " + luas);
    }
}

package ngoding;

import java.util.ArrayList;
import java.util.Scanner;

public class Day34 {

    public static void main(String[] args) {
        //Array List Nama Buah
        ArrayList namaBuah = new ArrayList();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan nama Buah : ");
            String namaBuah1 = sc.nextLine();
            namaBuah.add(namaBuah1);
            System.out.println(namaBuah);
        }
        //remove untuk menghapus buah pertama dari array / indeks 0.
        namaBuah.remove(0);
        // set untuk mengganti buah ke 7 / indeks 6 dengan Apel.
        namaBuah.set(6, "Apel");
        System.out.println("Nama Buah : " + namaBuah);
    }
}

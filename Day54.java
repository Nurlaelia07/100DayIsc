package ngoding;

import java.util.ArrayList;
import java.util.Scanner;

public class Day54 {

    public static void main(String[] args) {

        // Mendeklarasikan array list
        ArrayList<Integer> angka = new ArrayList<>();

        // Menambahkan elemen ke array list dari inputan
        Scanner isc = new Scanner(System.in);
        
        // Meminta user untuk memasukkan jumlah angka
        System.out.println("Masukkan jumlah angka: ");
        int jumlahAngka = isc.nextInt();

        for (int i = 0; i < jumlahAngka; i++) {
            //Meminta untuk memasukkan angka ke-i
            System.out.println("Masukkan angka ke-" + (i + 1) + ": ");
            //angka. add untuk menambahkan angka yang kita masukkan ke dalam arrat list
            angka.add(isc.nextInt());
        }

        // Mencetak array list
        System.out.println("Array list: " + angka);

        // Mengambil elemen 1 dari array list
        int element = angka.get(1);
        System.out.println("Elemen ke-1: " + element);

        // Menghapus elemen 1 dari array list
        angka.remove(1);
        System.out.println("Array list setelah menghapus elemen ke-1: " + angka);

        // Mengurutkan array list
        angka.sort(null);
        System.out.println("Array list setelah diurutkan: " + angka);
    }
}

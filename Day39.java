package ngoding;

import java.util.ArrayList;
import java.util.Scanner;

public class Day39 {

    public static void main(String[] args) {
        ArrayList mahasiswa = new ArrayList();

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlah = input.nextInt();

        for (int x = 0; x < jumlah; x++) {
            Scanner input1 = new Scanner(System.in);
            System.out.print("Masukkan Nama Mahasiswa : ");
            String nama = input1.nextLine();

            mahasiswa.add(nama);
        }

        System.out.println("Daftar Mahasiswa : " + mahasiswa);
    }
}

package ngoding;

import java.util.ArrayList;
import java.util.Scanner;

public class Day48_Array {
    public static void main(String[] args) {
        ArrayList namaMahasiswa = new ArrayList();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nama mahasiswa : ");
            String namaMhs = sc.nextLine();
            namaMahasiswa.add(namaMhs);
            System.out.println("Nama - Nama Mahasiswa : " + namaMahasiswa);
        }
        // Remove untuk menghapus (indeks ke-2)
        namaMahasiswa.remove(2);
        System.out.println("Nama - Nama Mahasiswa setelah indeks ke- 2 dihapus :  " + namaMahasiswa);
        // Set untuk mengganti (indeks ke-1)
        namaMahasiswa.set(1, "Laelia");
        System.out.println("Nama - nama Mahasiswa setelah di update : "+ namaMahasiswa);
    }
}

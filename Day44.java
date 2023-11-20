package ngoding;

import java.util.ArrayList;
import java.util.Scanner;

public class Day44 {

    public static void main(String[] args) {
        ArrayList namaMahasiswa = new ArrayList();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nama mahasiswa : ");
            String NmaMhs = sc.nextLine();
            namaMahasiswa.add(NmaMhs);
            System.out.println(namaMahasiswa);

        }

        namaMahasiswa.set(1, "Laelia");
        System.out.println(namaMahasiswa);

    }
}

package ngoding;

import java.util.ArrayList;
import java.util.Scanner;

public class Day42 {

    public static void main(String[] args) {
        int x;
        ArrayList angkaGenap = new ArrayList();
        ArrayList angkaGanjil = new ArrayList();

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Jumlah : ");
        int jumlah = sc.nextInt();

        for (x = 0; x < jumlah + 1; x++) {
            if (x % 2 == 0) {
                angkaGenap.add(x);
            } else {
                angkaGanjil.add(x);
            }
        }

        int jumlahGenap = 0;
        int jumlahGanjil = 0;

        for (x = 0; x < angkaGenap.size(); x++) {
            jumlahGenap += (int) angkaGenap.get(x);
        }

        for (x = 0; x < angkaGanjil.size(); x++) {
            jumlahGanjil += (int) angkaGanjil.get(x);
        }
        System.out.println(angkaGenap.indexOf(2));
        System.out.println("Angka Genap : " + angkaGenap);
        System.out.println("Jumlah Angka Genap : " + jumlahGenap);
        System.out.println("Angka Ganjil : " + angkaGanjil);
        System.out.println("Jumlah Angka Ganjil : " + jumlahGanjil);

    }
}

package ngoding;

import java.util.Scanner;

public class Day40 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah : ");
        int jumlah = sc.nextInt();
        System.out.print("Nilai yang habis dibagi 4 dari " + jumlah + " : ");
        for (int i = 1; i < jumlah; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }

        }System.out.println();

    }
}

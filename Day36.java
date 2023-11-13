package ngoding;

import java.util.Scanner;

public class Day36 {

    public static void main(String[] args) {
        System.out.print("Masukkan milai\t: ");
        int nilai = new Scanner(System.in).nextInt();

        for (int i = 1; i <= nilai; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

}

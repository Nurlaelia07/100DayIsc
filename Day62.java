package ngoding;

import java.util.Random;
import java.util.Scanner;

public class Day62 {

    public static void main(String[] args) {
        // Inisialisasi Scanner dan variabel
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];

        // Loop untuk mengisi data array secara unik
        for (int i = 0; i < n; i++) {
            int random = randomBilanganBulat(1, n); // Generate bilangan acak
            boolean isUnique = false; // Flag untuk cek keunikan

            // Looping untuk cek keunikan bilangan acak
            while (!isUnique) {
                isUnique = true; // Asumsi awal bilangan ini unik
                for (int j = 0; j < i; j++) { // Cek apakah sudah ada di array
                    if (data[j] == random) { // Jika sudah ada, generate ulang
                        isUnique = false;
                        random = randomBilanganBulat(1, n);
                        break;
                    }
                }
            }

            data[i] = random; // Simpan bilangan acak unik ke array
        }

        // Print array
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    /**
     * Generate bilangan bulat acak dalam range tertentu. min Batas minimum max
     * Batas maksimum
     *
     * @return Bilangan bulat acak dalam range
     */
    private static int randomBilanganBulat(int min, int max) {
        if (min > max) { // Swap jika min lebih besar dari max
            int temp = min;
            min = max;
            max = temp;
        }
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }
}

package ngoding;

import java.util.Arrays;
import java.util.Collections;

public class Day64 {

    public static void main(String[] args) {
        // Deklarasi array data dengan tipe data Integer
        Integer[] data = {23, 17, 4, 29, 26, 93, 176, 9, 26, 18, 64, 19, 2, 47};

        // Menampilkan data sebelum sorting
        System.out.println("Before Sorting : ");
        System.out.println(Arrays.toString(data));

        // Mengurutkan subarray menggunakan for loop
        for (int i = 0; i < data.length; i++) {
            // Looping untuk membandingkan setiap elemen array dengan elemen berikutnya
            for (int j = 0; j < data.length - i - 1; j++) {
                // Jika elemen pertama lebih besar dari elemen kedua, maka swap
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        // Menampilkan data setelah sorting
        System.out.println("After Sorting : ");
        System.out.println(Arrays.toString(data));
    }
}

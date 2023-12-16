package ngoding;

import java.util.Arrays;
import java.util.Collections;

public class Day69 {

  public static void main(String[] args) {
    // Deklarasi array dengan panjang 7
    int[] array = new int[7];

    // Perulangan untuk mengisi nilai elemen array dengan index
    for (int i = 0; i < array.length; i++) {
      // Periksa apakah index melebihi panjang array
      if (i >= array.length) {
        // Jika melebihi, buat array baru dengan panjang ditambah 1
        int[] arrayBaru = new int[array.length + 1];

        // Salin nilai elemen dari array lama ke array baru
        for (int x = 0; x < array.length; x++) {
          arrayBaru[x] = array[x];
        }

        // Update referensi array ke array baru yang lebih besar
        array = arrayBaru;
      }

      // Masukkan nilai index ke elemen array sesuai iterasi
      array[i] = i + 1;
    }

    // Cetak semua elemen array
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }
}

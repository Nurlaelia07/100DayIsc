package ngoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day68 {

  public static void main(String[] args) {
    //Deklarasi array
    int[] array = {1, 2, 3, 1, 4, 5, 2, 6, 7, 3, 1, 9, 2, 8};

    // Menampilkan isi array
    System.out.println("Array           : " + Arrays.toString(array));

    //Set untuk menyimpan elemen unik
    Set<Integer> uniqueElements = new HashSet<>();
    // Menambahkan setiap elemen array ke Set menggunakan for Each
    for (int i : array) {
      uniqueElements.add(i);
    }
    // Mencetak elemen 
    System.out.println("Unique elements : " + uniqueElements.toString());

  }
}
package ngoding;

import java.util.Arrays;

public class Day65 {

    public static void main(String[] args) {

        // Deklarasi array 2 dimensi 
        int[][] nilai = {
            {29, 32, 93},
            {42, 5, 18},
            {7, 12, 9}
        };
        // Menampilkan isi array menggunakan for each
        for (int[] baris : nilai) {
            System.out.println(Arrays.toString(baris));
        }
        // Menjumlahkan array 2 dimensi 
        int jumlah = 0;
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                jumlah += nilai[i][j];
            }
        }
        //Menampilkan hasil penjumlahan 
        System.out.println("Jumlah semua isi matriks: " + jumlah);
    }
}

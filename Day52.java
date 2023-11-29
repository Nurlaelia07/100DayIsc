package ngoding;

import java.util.HashMap;

public class Day52 {

    public static void main(String[] args) {

        //Hashmap adalah struktur data yang menyimpan data dalam pasangan key-value
        //membuat objek HashMap bernama ibuKotaNegara
        HashMap<String, String> ibuKotaNegara = new HashMap<String, String>();

        // menambahkan keys and value (negara, kota) menggunakan method put(key, value)
        ibuKotaNegara.put(" Indonesia " , " Jakarta");
        ibuKotaNegara.put(" Jepang " , " Tokyo");
        ibuKotaNegara.put(" China " , " Beijing");
        ibuKotaNegara.put(" India " , " New Delhi");

        // Menampilkan semua pasangan key dan value dalam HasMap
        System.out.println("Ibu Kota Negara : " + ibuKotaNegara);

        //Menampilkan jumlah pasangan key dan value dalam HashMap
        //Fungsi size() digunakan untuk mengembalikan jumlah elemen dalam objek Collection
        int a = ibuKotaNegara.size();
        System.out.println("Banyaknya ibu kota negara : " + a);

        // menampilkan semua key dalam HashMap
        // Fungsi keySet() mengembalikan set yang berisi semua key dalam objek Map
        System.out.print("key set : ");
        for (String b : ibuKotaNegara.keySet()) {
            System.out.print(b);
            int index = 0;
            if (index < b.length()) {
                System.out.print(", ");
                index++;
            }
        }
        System.out.println();

        //menampilkan semua value dalam HashMap
        //Fungsi values() mengembalikan collection yang berisi semua value dalam objek Map
        System.out.print("Values : ");
        for (String c : ibuKotaNegara.values()) {
            System.out.print(c);
            // Digunakan untuk menampilkan semua value dalam objek HashMap ibuKotaNegara
            int index = 0;
            if (index < c.length()) {
                System.out.print(", ");
                index++;
            }
        }
        System.out.println();
    }
}

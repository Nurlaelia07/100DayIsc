package ngoding;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Day60 {

    public static void main(String[] args) {
//        Hash map adalah struktur data yang menyimpan data berupa key-value 
//        Key adalah unik identifier untuk data, sedangkan value adalah data itu sendiri. 
//        Buat objek hash map
//        Tipe data: Map<String, String>
//        Key: Kode mata kuliah
//        Value: Nama mata kuliah
        Map<String, String> mataKuliah = new HashMap<>();
        // Kode mata kuliah: INF021319, Nama mata kuliah: Dasar Dasar Pemrograman
//        Method put() adalah method yang digunakan untuk menambahkan data ke objek hash map.
//        Method put() menerima dua parameter, yaitu key dan value.
        mataKuliah.put("INF021319", "Dasar Dasar Pemrograman"); 
        // Kode mata kuliah: INF183219, Nama mata kuliah: Struktur Data
        mataKuliah.put("INF183219", "Aplikasi Komputer"); 
        // Kode mata kuliah: INF103219, Nama mata kuliah: Aljabar Linear
        mataKuliah.put("INF103219", "Aljabar Linear"); 
        // Kode mata kuliah: INF275323, Nama mata kuliah: Rekayasa Perangkat Lunak
        mataKuliah.put("INF275323", "Rekayasa Perangkat Lunak"); 
        // Kode mata kuliah: IF5555, Nama mata kuliah: Sistem Basis Data
        mataKuliah.put("INF475223", "Robotics"); 

//        Menampilkan data dari hash map
//        Menggunakan loop for untuk iterasi melalui key set dari hash map
//        Pada setiap iterasi, mencetak kode mata kuliah dan nama mata kuliah
        System.out.println("Kode Mata Kuliah dan Nama Mata Kuliah " );
        for (String kode : mataKuliah.keySet()) {
            System.out.println(kode + " : " + mataKuliah.get(kode));
        }
    }
}


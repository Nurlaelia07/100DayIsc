package ngoding;
import java.util.LinkedList;
public class Day95 {
    // Mendeklarasikan linkedList untuk menyimpan nama mahasiswa KKPI
    static LinkedList<String> namaMhsKpi = new LinkedList<>();
    public static void main(String[] args) {
        // Menambahkan elemen
        // Menambahkan elemen 'Laelia' ke akhir linkedList
        System.out.println("Menambahkan elemen 'Laelia' ke akhir");
        namaMhsKpi.add("Laelia");
        System.out.println("Isi linkedList: " + namaMhsKpi);
        // Menambahkan elemen 'Nur' ke awal linkedList
        System.out.println("Menambahkan elemen 'Nur' ke awal");
        namaMhsKpi.addFirst("Nur");
        System.out.println("Isi linkedList: " + namaMhsKpi);
        // Menambahkan elemen 'Nike' ke akhir linkedList
        System.out.println("Menambahkan elemen 'Nike' ke akhir");
        namaMhsKpi.addLast("Nike");
        System.out.println("Isi linkedList: " + namaMhsKpi);
        // Menambahkan elemen 'Irfan' ke indeks 2 linkedList
        System.out.println("Menambahkan elemen 'Irfan' ke indeks 2");
        namaMhsKpi.add(2, "Irfan");
        System.out.println("Isi linkedList: " + namaMhsKpi);
        // Menghapus elemen
        // Menghapus elemen 'Nike' dari linkedList
        System.out.println("Menghapus elemen 'Nike'");
        namaMhsKpi.remove("Nike");
        System.out.println("Isi linkedList: " + namaMhsKpi);
        // Menghapus elemen berdasarkan indeks 1 dari linkedList
        System.out.println("Menghapus elemen berdasarkan indeks 1");
        namaMhsKpi.remove(1);
        System.out.println("Isi linkedList: " + namaMhsKpi);
        // Menghapus elemen pertama dari linkedList
       
    }
}

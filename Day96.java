package ngoding;
import java.util.HashSet;
public class Day96 {
    public static void main(String[] args) {
        // Membuat HashSet
        HashSet<String> namaPesertaKpiDiBps = new HashSet<>();
        // Menambahkan elemen ke HashSet
        namaPesertaKpiDiBps.add("Nike");
        namaPesertaKpiDiBps.add("Laelia");
        namaPesertaKpiDiBps.add("Irfan");
        namaPesertaKpiDiBps.add("Laelia");// Tidak akan ditambahkan karena duplikat
        namaPesertaKpiDiBps.add("Arya"); 
        // Menampilkan elemen HashSet
        System.out.println("Elemen HashSet: " + namaPesertaKpiDiBps);
        // Memeriksa apakah elemen ada di HashSet
        boolean adaLaelia = namaPesertaKpiDiBps.contains("Laelia");
        System.out.println("Apakah Laelia ada di dalam nama peserta kpi di Bps? " + adaLaelia);
        // Menghapus elemen dari HashSet
        namaPesertaKpiDiBps.remove("Arya");
        System.out.println("Nama Peserta Kpi di Bps setelah menghapus Arya: " + namaPesertaKpiDiBps);
    }
}


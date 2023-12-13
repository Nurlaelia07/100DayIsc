package ngoding;

public class Day66 {

    public static void main(String[] args) {
        // - Elemen array dengan tipe daata double
        double[] angka = {2.3, 4.0, 6.9, 8.2, 10.7};
        
        //inisialisasi nilai awal
        double hasilPerkalian = 1.0;
        double hasilPenjumlahan = 0.0;
        double hasilPengurangan = 0.0;
        
        for (int i = 0; i < angka.length; i++) {
            hasilPerkalian *= angka[i];
            hasilPenjumlahan += angka[i];
            hasilPengurangan -= angka[i];
        }

        // Hasil Output
        System.out.println("Hasil perkalian semua elemen dalam array: " + hasilPerkalian);
        System.out.println("Hasil penjumlahan semua elemen dalam array: " + hasilPenjumlahan);
        System.out.println("Hasil pengurangan semua elemen dalam array: " + hasilPengurangan);
    }
}
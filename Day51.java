package ngoding;
//mengimpor kelas ArrayList dan Iterator dari paket java.util. 
import java.util.ArrayList;
import java.util.Iterator;

public class Day51 {

    public static void main(String[] args) {
        ArrayList<String> namaKecamatan = new ArrayList<String>();
        namaKecamatan.add("Campalagian");
        namaKecamatan.add("Mapilli");
        namaKecamatan.add("Balanipa");
        namaKecamatan.add("Tinambung");
        namaKecamatan.add("Banggae");
        namaKecamatan.add("Wonomulyo");
        //Iterator untuk meng-iterasi namaKecamatan
        //Baris ini digunakan untuk membuat objek iterator dari kelas Iterator. 
        //Objek iterator ini kemudian digunakan untuk mengakses elemen-elemen dalam daftar namaKecamatan.
        Iterator iterator = namaKecamatan.iterator();
        //Menampilkan elemen - elemen nama kecamatan
        System.out.println("Elemen - elemen nama Kecamatan: ");
        //Baris ini digunakan untuk memulai pengulangan. 
        //Pengulangan akan terus dijalankan selama objek iterator masih memiliki elemen berikutnya.
        while (iterator.hasNext()) {
           // mencetak elemen berikutnya dari daftar namaKecamatan ke layar.
            System.out.print(iterator.next() + "; ");
        }
        System.out.println();
    }
}

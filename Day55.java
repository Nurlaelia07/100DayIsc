package ngoding;

import java.util.Stack;

public class Day55 {

    public static void main(String[] args) {

        // Stack adalah struktur data yang hanya bisa mengakses elemen dari atas tumpukan
        //Elemen yang terakhir masuk ke dalam stack akan menjadi elemen yang pertama keluar dari stack.
        // Buat Stack baru dengan namaMhs
        Stack<String> namaMhs = new Stack<>();
        
        //Push digunakan untuk memasukkan atau menambahkan data ke dalam stack.
        namaMhs.push("Laelia");
        namaMhs.push("Mike");
        namaMhs.push("Ical");
        namaMhs.push("Rizki");
        namaMhs.push("Ulfa");
        System.out.println("Nama - nama mahasiswa : " + namaMhs);

        //Pop digunakan untuk melihat, mengambil elemen sekaligus menghapusnya.
        String value = namaMhs.pop();
        System.out.println("Nama mahasiswa yang akan di hapus / POP : " + value);
        // Mencetak isi stack setelah dihapus
        System.out.println("Nama - nama mahasiswa setelah dihapus : " + namaMhs);

        //Peek melihat elemen teratas dari stack
        value = namaMhs.peek();
        System.out.println("Nama mahasiswa yang berada di posisi paling atas / Peek : " + value);
        //cetak isi stack setelah elemen teratas dicetak
        System.out.println("Nama - nama mahasiswa setelah elemen teratas dicetak : " + namaMhs);

        namaMhs.push("Nrlaelia");
        namaMhs.push("Nrulfa");
        namaMhs.push("NrZahra");
        System.out.println("Nama - nama mahasiswa setelah ditambahkan : " + namaMhs);

    }
}

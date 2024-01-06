package ngoding;
import java.util.Scanner;
public class Day90 {
    // Program ini akan menghitung luas dan keliling lingkaran.
    public static void main(String[] args) {
    // Inisialisasi scanner untuk membaca input dari pengguna.
        Scanner input = new Scanner(System.in);
    // Minta pengguna untuk memasukkan jari-jari.
        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();
    // Menghitung luas lingkaran.
        double luas = Math.PI * r * r;
    // Menghitung keliling lingkaran.
        double keliling = 2 * Math.PI * r;
    // Menampilkan luas dan keliling lingkaran.
        System.out.println("Luas lingkaran = " + luas);
        System.out.println("Keliling lingkaran = " + keliling);
    }
}

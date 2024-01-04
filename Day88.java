package ngoding;

import java.util.ArrayList;
import java.util.Scanner;

public class Day88 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Buat arraylist untuk menampung peralatan kantor
        ArrayList<String> peralatanKantor = new ArrayList<>();

        // Input jumlah peralatan kantor
        System.out.print("Masukkan jumlah peralatan kantor: ");
        int jumlahPeralatanKantor = input.nextInt();

        // Input nama peralatan kantor
        for (int i = 0; i < jumlahPeralatanKantor; i++) {
            System.out.print("Masukkan nama peralatan kantor ke-" + (i + 1) + ": ");
            peralatanKantor.add(input.next());
        }

        // Tampilkan peralatan kantor
        System.out.println("Peralatan kantor:");
        for (String peralatan : peralatanKantor) {
            System.out.println(peralatan);
        }

        // Akses indeks tertentu
        System.out.print("Masukkan indeks yang ingin diakses: ");
        int indeks = input.nextInt();
        System.out.println("Peralatan kantor pada indeks " + indeks + " adalah " + peralatanKantor.get(indeks));

        // Hapus indeks tertentu
        System.out.print("Masukkan indeks yang ingin dihapus: ");
        indeks = input.nextInt();
        peralatanKantor.remove(indeks);

        // Tampilkan peralatan kantor setelah dihapus
        System.out.println("Peralatan kantor setelah dihapus:");
        for (String peralatan : peralatanKantor) {
            System.out.println(peralatan);
        }
    }
}

package ngoding;
public class Day71 {
    public static void main(String[] args) {
        // Deklarasi array nama hewan
        String[] namaHewan = {"Kucing", "Kambing", "Ayam", "Kuda",
            "Sapi", "Tikus", "Singa", "Jerapah",
            "Gajah", "Kera", "Burung"};
        // Menampilkan semua nama hewan
        // for loop untuk iterasi array nama hewan
        for (int i = 0; i < namaHewan.length; i++) {
            // Menampilkan nama hewan dengan indeks i
            System.out.println("Nama Hewan [" + (i) + "] : " + namaHewan[i]);
        }
        // Menampilkan nama hewan ke-3
        System.out.println("Nama hewan ke-3: " + namaHewan[3]);

        // Menampilkan nama hewan ke-7
        System.out.println("Nama hewan ke-7: " + namaHewan[7]);

        // Menampilkan nama hewan indeks terakhir
        System.out.println("Nama hewan indeks terakhir: " + namaHewan[namaHewan.length - 1]);

        // Mengganti nama hewan indeks ke-9 menjadi "Harimau"
        namaHewan[9] = "Harimau";

        // Menampilkan semua nama hewan setelah diganti
        // for loop untuk iterasi array nama hewan
        for (int i = 0; i < namaHewan.length; i++) {
            // Menampilkan nama hewan dengan indeks i
            System.out.println("Nama Hewan[" + (i) + "] : " + namaHewan[i]);
        }
    }
}

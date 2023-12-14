package ngoding;

public class Day67 {

    public static void main(String[] args) {

        String teks = "Nama SAYA ADALAH NUrlaelia.";

        // Deklarasi variabel teksLower
        StringBuilder teksLower = new StringBuilder();

        // Perulangan pada setiap karakter dalam teks
        for (char c : teks.toCharArray()) {
            // Memeriksa apakah karakter saat ini adalah huruf besar
            if (Character.isUpperCase(c)) {
                // Mengubah karakter menjadi huruf kecil
                c = Character.toLowerCase(c);
            }
            // Menambahkan karakter saat ini ke teksLower
            teksLower.append(c);
        }
        // Mengubah teks menjadi huruf besar
        String teksUpper = teks.toUpperCase();
        // Mencetak teks asli dan teks yang sudah diubah
        System.out.println("Teks asli: " + teks);
        System.out.println("Teks lowercase: " + teksLower.toString());
        System.out.println("Teks uppercase: " + teksUpper);
    }
}

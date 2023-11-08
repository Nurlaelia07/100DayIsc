package ngoding;

public class Day31 {

    public static void main(String[] args) {
        // Array yang menampung nama buah
        String[] buah = {"Apel", "Mangga", "Semangka", "Anggur", "Nenas", "Jeruk", "Pisang", "Alpukat", "Rambutan", "Durian"};
        for (int i = 0; i < buah.length; i++) {
            if (i == buah.length - 1) {
                System.out.print(buah[i]);
            } else {
                System.out.print(buah[i] + ", ");

            }
        }
    }
}

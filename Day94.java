package ngoding;

public class Day94 {

    public static int factorial(int n) {
        //Fungsi ini menghitung faktorial dari n
        // n: Bilangan integer
        // Nilai kembalian:
        // Fatorial dari n
        if (n == 0) {
            // Faktorial dari 0 adalah 1
            return 1;
        } else {
            // Recursive call:
            // Panggil fungsi ini sendiri dengan argumen n - 1
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Inisialisasi variabel num dengan nilai 5
        int num = 5;
        // Memanggil fungsi factorial() untuk menghitung faktorial dari num
        int result = factorial(num);
        // Menampilkan hasil faktorial ke layar
        System.out.println("Faktorial dari " + num + " adalah " + result);
    }
}


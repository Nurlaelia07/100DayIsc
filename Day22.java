
package ngoding;

import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        int angka, factorial;
        // Scanner Inputan
        Scanner isc = new Scanner(System.in);
        // Menerima inputan
        System.out.print("Masukkan nilai: ");
        angka = isc.nextInt();
        // Factorial
        factorial = 1;
        for (int i = 1; i <= angka; i++) {
            factorial *= i;
        }
        System.out.println("Factorial " + angka+ " adalah " + factorial);
    }
}

    
   


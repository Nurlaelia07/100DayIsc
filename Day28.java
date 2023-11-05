package ngoding;

import java.util.Scanner;

public class Day28 {

    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = isc.nextDouble();

        System.out.print("Masukkan operasi (+, -, *, /): ");
        char operator = isc.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = isc.nextDouble();

        double result = 0;
        switch (operator) {
            case '+':
                result = angka1 + angka2;
                break;
            case '-':
                result = angka1 - angka2;
                break;
            case '*':
                result = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    result = angka1 / angka2;
                } else {
                    System.out.println("Error: Pembagian oleh nol.");
                    return;
                }
                break;
            default:
                System.out.println("Operasi tidak valid.");
                return;
        }
        System.out.println("Hasil: " + result);

        isc.close();
    }
}

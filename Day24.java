import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 

        Scanner isc = new Scanner(System.in);
        int bilangan;

        do {
            // Meminta kita untuk memasukkan bilangan atau angka yang dimana, kita akan terus diminta untuk memasukkan angka sampai kita memasukkan angka 0
            System.out.print("Masukkan bilangan (0 untuk berhenti): ");
            bilangan = isc.nextInt();
        } while (bilangan != 0);

        System.out.print("Program berhenti. Terima kasih!");
    }
}
       
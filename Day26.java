import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
     int batasAtas;
    Scanner isc = new Scanner(System.in);
        System.out.print("Masukkan batas atas bilangan genap yang ingin anda tampilkan: ");
        batasAtas = isc.nextInt();
        // menginisialisasi variabel angka dengan nilai awal 2
        int angka = 2 ;              
        while (angka <= batasAtas) {
            System.out.println(angka);
            angka += 2;
        }
   
   }
     
 }

import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
      //perulangan dan operator modulo
      int angka;
      Scanner isc = new Scanner(System.in);
      System.out.print("Masukkan angka  : ");
      angka = isc.nextInt();
      for (int i = 1; i <= angka; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
   }
   }
 }

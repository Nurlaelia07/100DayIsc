import java.util.*;

 

 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner isc = new Scanner(System.in);

        int nilai;
        System.out.print("Masukkan nilai: ");
        nilai = isc.nextInt();

        // Percabangan nested atau bersarang 
        if (nilai >= 0) { 
            if (nilai % 2 == 0) {
                System.out.println("Nilai positif genap");
            } else {
                System.out.println("Nilai positif ganjil");
            }
        } else {
            System.out.println("Nilai negatif");
        }
   }
 }

 import java.util.Scanner;
 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang!");
        System.out.print("Apakah Anda suka pemrograman? (ya/tidak): ");
        String jawaban = input.nextLine();

        if (jawaban.equalsIgnoreCase("ya")) {
            System.out.println("Anda adalah seorang pemrogram yang hebat!");
        } else {
            System.out.println("Tidak masalah, pemrograman adalah hal yang menarik!");
        }

        input.close();
    }
}  
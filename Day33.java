package ngoding;

import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = sc.nextInt();
        if (nilai % 3 == 0 && nilai % 5 == 0) {
            System.out.println("Master Class");            
        }else if (nilai % 5 == 0){
            System.out.println("Pride of 5 ");
        }else if (nilai % 3 == 0) {
            System.out.println("Pride of 3  ");
        }
        
    }
}

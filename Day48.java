package ngoding;

import java.util.Stack;

public class Day48 {

    public static void main(String[] args) {
        Stack<Integer> angka = new Stack<>();

        angka.push(1);
        angka.push(2);
        angka.push(3);
        angka.push(4);
        angka.push(6);
        angka.push(8);
        angka.push(9);

        System.out.println("Isi stack angka adalah : ");
        for (int i = 0; i < angka.size(); i++) {
            System.out.println(angka.get(i));

        }
        angka.pop();

        // Menampilkan isi stack
        System.out.println("Isi stack angka setelah menghapus 1 elemen:");
        for (int i = 0; i < angka.size(); i++) {
            System.out.println(angka.get(i));
        }
    }
}

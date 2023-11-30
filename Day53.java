package ngoding;

import java.util.LinkedList;

public class Day53 {

    public static void main(String[] args) {
        //Linked List adalah struktur data yang menyimpan data dalam bentuk
        //Node - node yang saling terkait satu sama lain.
        LinkedList<String> listBenda = new LinkedList<>();

        //Memasukkan elemen kedalam linked list
        //fungsi add() untuk menambahkan elemen ke dalam linked list
        listBenda.add("Meja");
        listBenda.add("Kursi");
        listBenda.add("Papan Tulis");
        listBenda.add("Rak Buku");
        listBenda.add("Buku Tulis");
        listBenda.add("Jam Dinding");

        //Menampilkan semua elemen dalam linked list
        System.out.println("Nama nama Benda : " + listBenda);

        // Remove() untuk menghapus object tertentu dalam linked list
        listBenda.remove("Meja");
        System.out.println("Nama nama Benda setelah Meja dihapus : " + listBenda);
        // Remove(int index) unntuk menghapus elemen pada posisi tertentu dari linked list
        listBenda.remove(3);
        System.out.println("Nama nama Benda setelah elemen pada posisi 3 dihapus : " + listBenda);
        // RemoveFirst() unntuk menghapus elemen pertama dari linked list
        listBenda.removeFirst();
        System.out.println("Nama nama Benda setelah eleman pertama dihapus : " + listBenda);
        // RemoveLast() unntuk menghapus elemen terakhir dari linked list
        listBenda.removeLast();
        System.out.println("Nama nama Benda setelah elemen terakhir dihapus : " + listBenda);

    }
}

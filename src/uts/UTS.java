package uts;

import java.util.Scanner;

public class UTS {
    public static void main(String[] args) {
        //No 2
        Author author1 = new Author("Author1", "author1@email.com", 'f');
        Author author2 = new Author("Author2", "author2@email.com", 'm');
        System.out.println("Menggunakan viewAuthor:");
        System.out.println(author1.viewAuthor());
        System.out.println("Menggunakan viewAuthor:");
        System.out.println(author2.viewAuthor());
        //No 3
        Book book1 = new Book("OOP for Dummy", author1, 500.0);
        Book book2 = new Book("Java for Super Dummy", author2, 1000.99, 10);
        System.out.println("Menggunakan viewBook:");
        System.out.println(book1.viewBook());
        System.out.println("Menggunakan viewBook:");
        System.out.println(book2.viewBook());
        //No 4
        System.out.println("Edit email");
        Scanner baca1 = new Scanner(System.in);
        System.out.println("Masukkan email baru untuk Author1:");
        author1.setEmail(baca1.nextLine());
        System.out.println("");
        System.out.println("Memakai Getter untuk view Author:");
        System.out.println("Nama: " + author1.getName());
        System.out.println("Email baru: " + author1.getEmail());
        System.out.println("Gender: " + author1.getGender());       
        //No 5
        Scanner baca2 = new Scanner(System.in);
        System.out.println("");
        System.out.println("Masukkan harga baru Buku1: ");
        book1.setPrice(baca2.nextDouble());
        System.out.println("");
        System.out.println("Memakai Getter untuk view Book1:");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("New Price: " + book1.getPrice());
        book1.getAuthor();       
        //No 6
        Scanner baca3 = new Scanner(System.in);
        System.out.println("");
        System.out.println("Masukkan jumlah baru Buku2: ");
        book2.setQty(baca3.nextInt());
        System.out.println("");
        System.out.println("Memakai Getter untuk view Book2:");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Price: " + book2.getPrice());
        System.out.println("New Quantity: " + book2.getQty());
        book2.getAuthor();
    }
}

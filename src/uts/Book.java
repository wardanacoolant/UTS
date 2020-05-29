package uts;

public class Book {
    private String title;
    private Author author;
    private double price;
    int qty = 0;
    public Book(String title, Author author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public Book(String title, Author author, double price, int qty){
        this.title = title;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    String getTitle(){
        return title;
    }
    Author getAuthor(){
        System.out.println("Author Name: " + author.getName());
        System.out.println("Author Email: " + author.getEmail());
        return author;
    }
    double getPrice(){
        return price;
    }
    void setPrice(double price){
        this.price = price;
    }
    int getQty(){
        return qty;
    }
    void setQty(int qty){
        this.qty = qty;
    }
    String viewBook(){
        System.out.println("Title: " + this.title);
        System.out.println("Author Name: " + author.getName());
        System.out.println("Price: " + this.price);
        System.out.println("Quantity: " + this.qty);
        return "";
    }
}

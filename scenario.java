package string;

public class scenario {

class Book {

    // Attributes (instance variables)
    String title;
    String author;
    String isbn;

    // Constructor
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    // Main method
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling", "12345");

        b1.display();
        
    }
}
}
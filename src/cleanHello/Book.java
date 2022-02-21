package cleanHello;

public class Book {
    public String title;
    public String author;
    public int numberOfPages;
    public String publisher;

    public Book(String title, String author, int numberOfPages, String publisher) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }

    public Book(String title, String author, int numberOfPages) {
        this(title, author, numberOfPages, "OC");
    }
}

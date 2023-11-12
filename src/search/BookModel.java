package search;

public class BookModel {
    private String title;
    private String author;
    private double price;
    private String genre;

    public BookModel(String title, String author, double price, String genre) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.genre = genre;
    }

    // Getter methods for attributes
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getGenre() {
        return genre;
    }
}

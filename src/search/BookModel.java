package search;

public class BookModel {
    private final String title;
    private final String author;
    private final double price;
    private final String genre;

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

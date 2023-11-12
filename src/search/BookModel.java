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

//public class BookModel {
//    public String title;
//    private String author;
//    private String isbn;
//    private double price;
//    private String genre;
//    static ArrayList<BookModel> bookInfos = new ArrayList<>();
//
//    /**
//     * This is the default constructor for a book.
//     */
//    public BookModel() {
//        this.title = title;
//        this.price = price;
//        this.isbn = isbn;
//        this.author = author;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public double getBookPrice() {
//        return price;
//    }
//
//    public void setBookPrice(double price) {
//        this.price = price;
//    }
//
//    public String getIsbn() {
//        return isbn;
//    }
//
//    public void setIsbn(String isbn) {
//        this.isbn = isbn;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }

//    public static BookModel getBookInfo(int indexNumber){
//        BookModel bookInfo = bookInfos.get(indexNumber);
//        return bookInfo;
//    }

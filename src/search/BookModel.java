package search;

import review.ReviewModel;

import java.util.ArrayList;

public class BookModel {
    public String title;
    private String author;
    private String publisher;
    private String isbn;
    private double price;
    private String genre;
    static ArrayList<BookModel> bookInfos = new ArrayList<>();

    /**
     * This is the default constructor for a book.
     *
     * @param bookTitle the title of the book
     * @param bookPrice the purchase price of the book
     * @param isbn      the isbn of the book
     * @param author    the author of the book
     */
    public BookModel(String bookTitle, double bookPrice, String isbn, String author) {
        this.title = bookTitle;
        this.price = bookPrice;
        this.isbn = isbn;
        this.author = author;
    }

    /**
     * Gets the title of the book.
     *
     * @return the book title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     *
     * @param bookTitle the new title of the book
     */
    public void setTitle(String bookTitle) {
        this.title = bookTitle;
    }

    /**
     * Gets the price of the book.
     *
     * @return the book price
     */
    public double getBookPrice() {
        return price;
    }

    /**
     * Sets the price of the book.
     *
     * @param bookPrice the new price of the book
     */
    public void setBookPrice(double bookPrice) {
        this.price = bookPrice;
    }

    /**
     * Gets the ISBN of the book.
     *
     * @return the ISBN of the book
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Sets the ISBN of the book.
     *
     * @param isbn the new ISBN of the book
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Gets the author of the book.
     *
     * @return the author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     *
     * @param author the new author of the book
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    public static BookModel getBookInfo(int indexNumber){
        BookModel bookInfo = bookInfos.get(indexNumber);
        return bookInfo;
    }

}

package search;

import java.util.ArrayList;

/**
 * Provides functionality to search for books.
 */
public class SearchBook {

    /**
     * Searches for a book by title.
     * @param title The title of the book to search for.
     * @return A BookModel representing the found book,
     * or null if no book was found.
     */
    public BookModel searchByTitle(String title) {
        // Stub: Return a book for any title
        System.out.println("Method searchByTitle called with title: " + title);
        return new BookModel(title, 15.99, "123456789", "Book Author");
    }

    /**
     * Searches for books by author.
     * @param author The author of the books to search for.
     * @return An array of BookModel representing the found books by the searched up author,
     * or empty array if no books were found.
     */
    public ArrayList<BookModel> searchByAuthor(String author) {
        // Stub: Return a list with a book for any author.
        System.out.println("Method searchByAuthor called with author: " + author);
        ArrayList<BookModel> result = new ArrayList<>();
        result.add(new BookModel("Book Title", 15.99, "123456789", author));
        return result;
    }

    /**
     * Searches for a book using its ISBN code.
     * @param isbn The ISBN code of the desired book.
     * @return A BookModel instance representing the found book,
     * or null if no book is found with the specified ISBN.
     */
    public BookModel searchByIsbn(String isbn) {
        // Stub: Return a book for any ISBN
        System.out.println("Method searchByTitle called with title: " + isbn);
        //isbnApiService.lookupByIsbn(isbn);
        return new BookModel("Book Title", 15.99, isbn, "Book Author");
    }

    /**
     * Searches for a book based on the given keyword.
     * @param keyword The keyword to search for.
     * @return List of books that matches the keyword.
     */
    public static ArrayList<BookModel> search(String keyword) {
        // Stub: Return an empty array for keyword search
        System.out.println("Method search called with keyword: " + keyword);
        ArrayList<BookModel> bookInfo = new ArrayList<>();  
        return bookInfo;
    }
}

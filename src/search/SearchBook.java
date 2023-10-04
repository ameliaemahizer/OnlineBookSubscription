package search;

import java.util.ArrayList;

/**
 * Provides functionality to search for books.
 */
public class SearchBook {

    private isbnApi isbnApiService;

    /**
     * Searches for a book by title.
     * @param title The title of the book to search for.
     * @return A BookModel representing the found book,
     * or null if no book was found.
     */
    public BookModel searchByTitle(String title) {
        // Next step: Add implementation code here
        return null;
    }

    /**
     * Searches for books by author.
     * @param author The author of the books to search for.
     * @return An array of BookModel representing the found books by the searched up author,
     * or empty array if no books were found.
     */
    public ArrayList<BookModel> searchByAuthor(String author) {
        // Next step: Add implementation code here
        return null;
    }

    /**
     * Searches for a book using its ISBN code.
     * @param isbn The ISBN code of the desired book.
     * @return A BookModel instance representing the found book,
     * or null if no book is found with the specified ISBN.
     */
    public BookModel searchByIsbn(String isbn) {
        // Next Step: Add implementation code here
        return isbnApiService.lookupByIsbn(isbn);
    }

    /**
     * Filters the search by price range.
     * @param minPrice The minimum price of the books to search for.
     * @param maxPrice The maximum price of the books to search for.
     * @return An array of BookModel representing the found books,
     * or an empty array if no books were found.
     */
    public ArrayList<BookModel> filterByPriceRange(double minPrice, double maxPrice) {
        // Next step: Add implementation code
        return null;
    }

    /**
     * Searches for a book based on the given keyword.
     * @param keyword The keyword to search for.
     * @return List of books that matches the keyword.
     */
    public static ArrayList<BookModel> search(String keyword) {
        // Next step: Add implementation code
        return null;
    }
}

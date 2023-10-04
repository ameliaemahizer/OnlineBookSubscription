package search;

import java.util.ArrayList;

/**
 * Interface defining the public methods for searching books.
 */
public interface SearchBookInterface {
    /**
     * Searches for a book based on the given keyword.
     * @param keyword The keyword to search for.
     * @return List of books as search result matching the keyword.
     */
    ArrayList<BookModel> displaySearchResult(String keyword);
}

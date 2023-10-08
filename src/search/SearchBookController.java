package search;

import java.util.ArrayList;

public class SearchBookController {

    private SearchBook searchBook;

    /**
     * This is the default constructor for the SearchBookController class.
     * Initialize the SearchBook instance.
     */
    public SearchBookController() {

        this.searchBook = new SearchBook();
    }

    /**
     * Searches for books using the specified keyword.
     * @param keyword The keyword to search for.
     * @return List of books matching the keyword.
     */

    public ArrayList<BookModel> searchBooks(String keyword) {
        return SearchBook.search(keyword);
    }
}

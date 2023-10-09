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
    public static ArrayList<BookModel> searchBooks(String keyword) {

        ArrayList<BookModel> searchResult = SearchBook.search(keyword);

        // Check if there are search results
        if (searchResult.isEmpty()) {
            System.out.println("No books found matching the keyword: " + keyword);
        } else {
            System.out.println("Books found matching the keyword: " + keyword);
            for (BookModel book : searchResult) {
                // Display book information to the user
                System.out.println("Title: " + book.getBookTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("ISBN: " + book.getIsbn());
                System.out.println("Price: $" + book.getBookPrice());
            }
        }
        return searchResult;
    }
}

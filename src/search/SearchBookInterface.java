package search;

import review.ReviewModel;
import search.BookModel;

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
// Attempt:
//    public ArrayList<BookModel> displaySearchResult(String keyword) {
//        System.out.println("Search Result");
//
//        BookModel book = BookModel.getBookInfo(0);
//
//        System.out.println("Book Title: " + book.getBookTitle() + "\n"
//                + "Book Author: " + book.getAuthor() + "\n"
//                + "ISBN Code: " + book.getIsbn() + "\n"
//                + "Price:" + book.getBookPrice() + "\n");
//        return null;
//    }
}

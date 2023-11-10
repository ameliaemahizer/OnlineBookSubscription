package search;

import review.ReviewModel;
import search.BookModel;

import java.util.ArrayList;

/**
 * Interface defining the public methods for searching books.
 */
public interface SearchBookInterface {
    static ArrayList<BookModel> search(String query, ArrayList<BookModel> books);
}


package search;

// Will continue to work on this
import java.util.List;
public interface SearchBookInterface {

    /**
     * Interface defining the public methods for searching books.
     */
    List<BookModel> search(String searchTerm, List<BookModel> bookModels);
    List<BookModel> filterBooksByPrice(double maxPrice);
    List<BookModel> filterBooksByGenre(String genre);
    List<BookModel> filterBooksByAuthor(String author);
}

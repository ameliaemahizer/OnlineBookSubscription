package search;
import java.util.List;
import java.util.stream.Collectors;


public class TitleSearch implements SearchBook {

    /**
        * Searches for a book by title.
        * @param title The title of the book to search for.
        * @return A BookModel representing the found book,
        * or null if no book was found.
    */
    @Override
    public List<BookModel> search(String query, List<BookModel> books) {
        return books.stream()
                .filter(book -> book.getTitle().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());
    }
}

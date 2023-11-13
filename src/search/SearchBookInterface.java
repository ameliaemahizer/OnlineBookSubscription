package search;

// Will continue to work on this
import java.util.List;
public interface SearchBookInterface {
    List<BookModel> search(String searchTerm, List<BookModel> bookModels);
}

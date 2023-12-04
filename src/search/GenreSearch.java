package search;

import search.BookModel;
import java.util.List;
import java.util.stream.Collectors;

public class GenreSearch extends SearchView {
    public GenreSearch(SearchBookController controller) {
        super(controller);
    }

    public List<BookModel> searchBook(String genre, List<BookModel> bookModels) {
        return bookModels.stream()
                .filter(bookModel -> bookModel.getGenre().toLowerCase().contains(genre.toLowerCase()))
                .collect(Collectors.toList());
    }
}

package search;

import search.BookModel;
import java.util.List;
import java.util.stream.Collectors;

public class TitleSearch extends SearchView {

    public TitleSearch(SearchBookController controller) {
        super(controller);
    }

    public List<BookModel> search(String searchTerm, List<BookModel> bookModels) {
        return bookModels.stream()
                .filter(bookModel -> bookModel.getTitle().toLowerCase().contains(searchTerm.toLowerCase()))
                .collect(Collectors.toList());
    }
}

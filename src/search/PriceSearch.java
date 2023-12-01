package search;

import search.BookModel;
import java.util.List;
import java.util.stream.Collectors;

public class PriceSearch extends SearchView {

    public PriceSearch(SearchBookController controller) {
        super(controller);
    }

    public List<BookModel> search(double maxPrice, List<BookModel> bookModels) {
        return bookModels.stream()
                .filter(bookModel -> bookModel.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }
}

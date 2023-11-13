package search;

import search.BookModel;
import java.util.List;
import java.util.stream.Collectors;

public abstract class PriceSearch implements SearchBookInterface {

    public List<BookModel> search(double maxPrice, List<BookModel> bookModels) {
        return bookModels.stream()
                .filter(bookModel -> bookModel.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }
}

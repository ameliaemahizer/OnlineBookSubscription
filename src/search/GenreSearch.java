package search;

import search.BookModel;
import java.util.List;
import java.util.stream.Collectors;

public abstract class GenreSearch implements SearchBookInterface {

    @Override
    public List<BookModel> search(String genre, List<BookModel> bookModels) {
        return bookModels.stream()
                .filter(bookModel -> bookModel.getGenre().toLowerCase().contains(genre.toLowerCase()))
                .collect(Collectors.toList());
    }
}

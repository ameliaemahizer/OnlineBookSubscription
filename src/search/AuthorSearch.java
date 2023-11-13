package search;

import search.BookModel;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AuthorSearch implements SearchBookInterface {

    @Override
    public List<BookModel> search(String author, List<BookModel> bookModels) {
        return bookModels.stream()
                .filter(bookModel -> bookModel.getAuthor().toLowerCase().contains(author.toLowerCase()))
                .collect(Collectors.toList());
    }
}

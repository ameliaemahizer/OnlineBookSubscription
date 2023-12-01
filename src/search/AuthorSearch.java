package search;

import search.BookModel;
import java.util.List;
import java.util.stream.Collectors;

public class AuthorSearch extends SearchView {

    public AuthorSearch(SearchBookController controller) {
        super(controller);
    }
    public List<BookModel> searchBook(String author, List<BookModel> bookModels) {
        return bookModels.stream()
                .filter(bookModel -> bookModel.getAuthor().toLowerCase().contains(author.toLowerCase()))
                .collect(Collectors.toList());
    }
}

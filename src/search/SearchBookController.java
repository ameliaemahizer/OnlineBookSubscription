package search;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchBookController {
    private ArrayList<BookModel> bookModels;
    private SearchBookInterface searchStrategy;

    public SearchBookController(ArrayList<BookModel> bookModels) {
        this.bookModels = bookModels;
    }

    public List<BookModel> searchBooks(String searchTerm) {
        return bookModels.stream()
                .filter(bookModel -> bookModel.getTitle().toLowerCase().contains(searchTerm.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<BookModel> filterBooksByPrice(double maxPrice) {
        return bookModels.stream()
                .filter(bookModel -> bookModel.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public List<BookModel> filterBooksByGenre(String genre) {
        return bookModels.stream()
                .filter(bookModel -> bookModel.getGenre().toLowerCase().contains(genre.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<BookModel> filterBooksByAuthor(String author) {
        return bookModels.stream()
                .filter(bookModel -> bookModel.getAuthor().toLowerCase().contains(author.toLowerCase()))
                .collect(Collectors.toList());
    }

    public void setSearchStrategy(SearchBookInterface searchStrategy) {
        this.searchStrategy = searchStrategy;
    }
}

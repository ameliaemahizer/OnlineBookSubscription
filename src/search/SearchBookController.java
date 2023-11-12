package search;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchBookController {
    private ArrayList<BookModel> bookModels;

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
                .filter(bookModel -> bookModel.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }
}

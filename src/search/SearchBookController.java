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


//package search;
//
//import login.LoginView;
//import review.ViewReviewInterface;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//public class SearchBookController {
//
//    private SearchView searchView;
//    private ArrayList<BookModel> books;
//
//    public SearchBookController() {
//        //searchBook = new SearchBook();
//        //books =
//        searchView = new SearchView();
//    }
////    public void setSearchStrategy(SearchBook strategy) {
////        searchBook.setStrategy(strategy);
////    }
////
////    public ArrayList<BookModel> search(String query) {
////
////        return searchBook.executeSearch(query, books);
////    }
//}
package search;

import review.ViewReviewInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SearchBookController {

    private SearchBook searchBook;
    private ArrayList<BookModel> books;


    public static void main(String[] args) {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://src/database/BookClubDatabase1.accdb");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(("select Book.ID, Book.Title, " +
                    "Genre.Genre from Book, Genre " +
                    " where Book.Genre=Genre.ID" ));
            while(rs.next()){
                System.out.println("Book ID: " + rs.getString(1)
                        + "; Name: " + rs.getString(2) + "; Genre: "
                        + rs.getString(3));
            }
            conn.commit();
            conn.close();


        } catch (Exception ee) {
            System.out.println(ee);
        }

    }
    public SearchBookController() {
        searchBook = new SearchBook();
        books = // Load books from the database
    }

    public void setSearchStrategy(SearchBook strategy) {
        searchBook.setStrategy(strategy);
    }

    public ArrayList<BookModel> search(String query) {
        return searchBook.executeSearch(query, books);
    }
}
    // Sample books
//    public ArrayList<BookModel> sampleBooks = new ArrayList<>();
//    // Add some sample books to the list
//    sampleBooks.add(new BookModel("book 1 abc", 15.99, "123456789", "John Doe"));
//    sampleBooks.add(new BookModel("book 2 abc def", 24.99, "987654321", "Jane Smith"));
//    sampleBooks.add(new BookModel("book 3", 39.99, "567890123", "Robert Johnson"));

//
//    /**
//     * This is the default constructor for the SearchBookController class.
//     * Initialize the SearchBook instance.
//     */
//    public SearchBookController() {
//        this.searchBook = new SearchBook();
//    }
//
//    /**
//     * Searches for books using the specified keyword.
//     *
//     * @param keyword The keyword to search for.
//     * @return List of books matching the keyword.
//     */
//    public static ArrayList<BookModel> searchBooks(String keyword) {
//
//        ArrayList<BookModel> searchResult = SearchBook.search(keyword);
//
////        for (BookModel book : sampleBooks) {
////            if (book.getBookTitle().toLowerCase().contains(keyword.toLowerCase()) ||
////                    book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
////                searchResult.add(book);
////            }
////        }
//
//        if (searchResult.isEmpty()) {
//            System.out.println("No books found matching the keyword: " + keyword);
//        } else {
//            System.out.println("Books found matching the keyword: " + keyword);
//            for (BookModel book : searchResult) {
//                // Display book information to the user
//                System.out.println("Title: " + book.getBookTitle());
//                System.out.println("Author: " + book.getAuthor());
//                System.out.println("ISBN: " + book.getIsbn());
//                System.out.println("Price: $" + book.getBookPrice());
//            }
//        }
//        return searchResult;
//    }
//}
//

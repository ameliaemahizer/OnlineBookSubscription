package purchase;

import java.util.ArrayList;
import search.BookModel;

public class UserModel {

    private String username;
    private double credits = 30.0; // default credits

    // User's purchased book list
    private ArrayList<BookModel> userLibrary = new ArrayList<>();

    public void addBookToUserLibrary(BookModel book) {
        userLibrary.add(book);
    }
}

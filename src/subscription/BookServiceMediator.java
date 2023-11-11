package subscription;

import login.Reader;
import login.UserModel;
import search.BookModel;

public interface BookServiceMediator {

    boolean deliverBook(Reader reader, BookModel book);

    void discussBook(UserModel user, BookModel book, String message);

}

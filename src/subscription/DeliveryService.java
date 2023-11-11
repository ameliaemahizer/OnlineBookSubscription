package subscription;

import search.BookModel;

public class DeliveryService {
    private String email;
    private String username;

    public void deliver(BookModel book, String email){
        System.out.println(book.getBookTitle() + " sent to " + email);
    }
}

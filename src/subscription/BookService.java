package subscription;

import discussion.DiscussionBoardController;
import discussion.DiscussionPostModel;
import login.Reader;
import login.UserModel;
import search.BookModel;

public class BookService implements BookServiceMediator {

    private BookInventory inventory;
    private DiscussionBoardController discussionPost;

    private DeliveryService deliveryService;

    public BookService(BookInventory inventory, DiscussionPostModel discussionPostModel) {
        this.inventory = inventory;
        this.discussionPost = discussionPost;
    }



    @Override
    public boolean deliverBook(Reader reader, BookModel book) {

        if(inventory.contains(book)){
            deliveryService.deliver(book, reader.getEmail());
            return true;
        }
        else{
            System.out.println("Book not in system.");
            return false;
        }

    }

    @Override
    public void discussBook(UserModel user, BookModel book, String message) {
        discussionPost.createDiscussionPost();

    }
}

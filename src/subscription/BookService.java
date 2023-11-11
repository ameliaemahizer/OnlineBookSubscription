package subscription;

import discussion.DiscussionBoardController;
import discussion.DiscussionPostModel;
import login.Reader;
import login.UserModel;
import search.BookModel;

import java.util.Scanner;

public class BookService implements BookServiceMediator {

    private BookInventory inventory;
    private DiscussionBoardController discussionPost;

    private DeliveryService deliveryService;
    Scanner scanner = new Scanner(System.in);

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
    public void createDiscussionPost(UserModel user, BookModel book) {
        String title;
        String body;

        System.out.println("Enter your title: ");
        title = scanner.nextLine();

        System.out.println("Enter the body of the post: ");
        body = scanner.nextLine();

        discussionPost.createDiscussionPost(user, title, body, book.getBookTitle());

    }

    @Override
    public void createDiscussionReply(UserModel user, DiscussionPostModel parentPost) {


    }

}


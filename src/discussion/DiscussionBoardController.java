package discussion;
import login.UserModel;
import subscription.BookServiceMediator;

import java.awt.print.Book;


public class DiscussionBoardController {

    private UserModel userModelName;
    private String postTitle;
    private String mainPost;
    private DiscussionReplyModel reply = new DiscussionReplyModel();
    private DiscussionPostModel discussionPost = new DiscussionPostModel();
    private DiscussionBoardInterface discussionBoardInterface;

    private BookServiceMediator bookService;

    /**
     * This is the default constructor for the DiscussionBoard class
     */
    public DiscussionBoardController() {

    }

    /**
     * Creates main discussion post
     * @return right now, returns null, but it will return the combined main post
     */
    public DiscussionPostModel createDiscussionPost(UserModel user, String postTitle, String body, String bookTitle){
        this.discussionBoardInterface = new DiscussionBoardInterface();


        System.out.println("Poster: " + user.getUsername());
        discussionPost.setUserModelName(user);

        System.out.println("Book: " + bookTitle);
        discussionPost.setBookTitle(bookTitle);

        System.out.println("Post Title: " + postTitle);
        discussionPost.setPostTitle(postTitle);

        System.out.println("Body: " + body);
        discussionPost.setMainPost(body);

        System.out.println("Post successfully posted!");
        this.discussionBoardInterface.displayDiscussionPost(discussionPost);

        bookService.createDiscussionReply(user, discussionPost);

        return discussionPost;
        
    }

    /**
     * Creates reply
     * @return returns combined reply
     */
    public DiscussionReplyModel createDiscussionReply(UserModel user, String body, DiscussionPostModel parentPost){


        System.out.println("Poster: " + user.getUsername());
        reply.setUserName(user);

        System.out.println("Body: ");
        reply.setPostReply(body);

        return reply;
    }
}
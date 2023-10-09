package discussion;
import login.User;


public class DiscussionBoardController {

    private User userName;
    private String postTitle;
    private String mainPost;
    private DiscussionReplyModel reply = new DiscussionReplyModel();
    private DiscussionPostModel discussionPost = new DiscussionPostModel();
    private DiscussionBoardInterface discussionBoardInterface;

    /**
     * This is the default constructor for the DiscussionBoard class
     */
    public DiscussionBoardController() {
        createDiscussionPost();
    }

    /**
     * Creates main discussion post
     * @return right now, returns null, but it will return the combined main post
     */
    public DiscussionPostModel createDiscussionPost(){
        this.discussionBoardInterface = new DiscussionBoardInterface();

        System.out.println("What is the title of the post?");
        discussionPost.setPostTitle();

        System.out.println("What is the body of the post?");
        discussionPost.setMainPost();

        this.discussionBoardInterface.displayDiscussionPost(discussionPost);

        createDiscussionReply();

        return discussionPost;
        
    }

    /**
     * Creates reply
     * @return right now, return null, but it will return the combined reply
     */
    public DiscussionReplyModel createDiscussionReply(){

        reply.setPostReply("That's a great insight! I agree completely.");

        this.discussionBoardInterface.displayDiscussionReply(reply);
        return reply;
    }
}
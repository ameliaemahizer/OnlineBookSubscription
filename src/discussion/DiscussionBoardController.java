package discussion;
import login.User;

public class DiscussionBoardController {

    private User userName;
    private String postTitle;
    private String mainPost;
    private String reply;
    private DiscussionBoardInterface discussionBoardInterface;

    /**
     * This is the default constructor for the DiscussionBoard class
     */
    public DiscussionBoardController() {
        this.discussionBoardInterface
    }

    /**
     * Creates main discussion post
     * @param userName username associated with the post
     * @param postTitle title of the post
     * @param post text of the discussion post
     * @return right now, returns null, but it will return the combined main post
     */
    public DiscussionPostModel createDiscussionPost(String userName, String postTitle, String post){
        Scanner s = new Scanner(System.in);
        System.out.println("Write your discussion: ");
        
    }

    /**
     * Creates reply
     * @param userName username associated with the post
     * @param reply text of the reply
     * @return right now, return null, but it will return the combined reply
     */
    public DiscussionReplyModel createDiscussionReply(String userName, String reply){
        return null;
    }
}
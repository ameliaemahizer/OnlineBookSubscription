package discussion;
import login.User;

public class DiscussionPostModel {
    private User userName;
    private String postTitle;
    private String mainPost;

    /**
     * This is the default controller for the DiscussionPostModel
     * @param userName username associated with the post
     * @param postTitle title associated with the post
     * @param mainPost main text of the post
     */

    public DiscussionPostModel (User userName, String postTitle, String mainPost){
        this.userName = userName;
        this.postTitle = postTitle;
        this.mainPost = mainPost;
    }
}

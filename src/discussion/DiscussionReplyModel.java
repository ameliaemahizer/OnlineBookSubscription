package discussion;


import login.User;

public class DiscussionReplyModel {
    private User userName;
    private String postReply;

    /**
     * This is the default constructor for DiscussionReplyModel
     * @param userName username associated with the reply
     * @param postReply main text of the reply
     */
    public DiscussionReplyModel(User userName, String postReply){
        this.userName = userName;
        this.postReply = postReply;
    }
}
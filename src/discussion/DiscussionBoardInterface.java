package discussion;


public class DiscussionBoardInterface {

    /**
     * This is the default constructor for the DiscussionBoard class
     **/
    public DiscussionBoardInterface (){
    
    }

    /**
     * This displays the discussion post
     */
    public void displayDiscussionPost(DiscussionPostModel discussionPost){
        System.out.println("Discussion Post: \n" +
                "Username: " + discussionPost.getUserModelName().getUsername() + "\n" +
                "Book: " + discussionPost.getBookTitle() + "\n" +
                "Title: " + discussionPost.getPostTitle() + "\n"
                + "Post Body: " + discussionPost.getMainPost() +
                "\n Test passed");
    }

    public void displayDiscussionReply(DiscussionReplyModel reply){
        System.out.println("Discussion Reply: \n " +
                reply.getPostReply() + "\n Test passed");
    }
}
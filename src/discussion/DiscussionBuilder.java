package discussion;

import java.util.Scanner;

import login.UserModel;

public class DiscussionBuilder implements Builder{
    private DiscussionPostModel discussionPostModel;
    private UserModel userName;
    private String postTitle;
    private String mainPost;
    private String postReply;

    /**
     * This is the default constructor for the DiscussionBoard class
     **/
    public DiscussionBuilder() {
        this.reset();
    }
    public void reset() {
        this.discussionPostModel = new DiscussionPostModel(userName, postTitle, mainPost);
      }

    /**
     * Returns the username associated with a discussion post
     * @return a string representing the username associated with the post
     **/
    public UserModel getUserName() {
        return userName;
    }

    /**
     * Returns the title associated with a discussion post
     * @return a string representing the title associated with the post
     **/
    public String getPostTitle() {
        return postTitle;
    }

    /**
     * Sets the title of the post
     * @param postTitle sets the title of the discussion post
     **/
    public void setPostTitle(String postTitle) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Title: ");
        postTitle = s.next();
        this.postTitle = postTitle;
    }

    /**
     * Returns the main discussion post
     * @return a string representing the main discussion post
     **/
    public String getMainPost() {
        return mainPost;
    }

    /**
     * Sets the main discussion post
     * @param mainPost sets the main discussion post
     **/
    public void setMainPost(String mainPost) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your post: ");
        mainPost = s.next();
        this.mainPost = mainPost;
    }

    /**
     * Returns the replies to the main discussion post
     * @return a string representing a reply
     **/
    public String getPostReply() {
        return postReply;
    }

    /**
     * Sets the reply to the main discussion post
     * @param postReply sets the reply
     */
    public void setPostReply(String postReply) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your reply: ");
        postReply = s.next();
        this.postReply = postReply;
    }

    public DiscussionPostModel getProduct(){
        return this.discussionPostModel;
    }

    @Override
    public void getUserName(UserModel userName) {
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getUserName'");
        System.out.println("johndoe");
    }

}

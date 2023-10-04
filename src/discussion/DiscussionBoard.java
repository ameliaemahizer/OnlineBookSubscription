package com.example.onlinebookclub.discussion;

import com.example.onlinebookclub.login.Login;

import java.util.ArrayList;

public class DiscussionBoard {
    private Login userName;
    private String postTitle;
    private String mainPost;
    private String postReplies;
    private ArrayList<String> discussionThreadList;

    /**
     * This is the default constructor for the DiscussionBoard class
     **/
    public DiscussionBoard() {

    }

    /**
     * Returns the username associated with a discussion post
     * @return a string representing the username associated with the post
     **/
    public Login getUserName() {
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
        this.mainPost = mainPost;
    }

    /**
     * Returns the replies to the main discussion post
     * @return a string representing a reply
     **/
    public String getPostReplies() {
        return postReplies;
    }

    /**
     * Sets the reply to the main discussion post
     * @param postReplies sets the reply
     */
    public void setPostReplies(String postReplies) {
        this.postReplies = postReplies;
    }

    /**
     * Returns the list of discussion posts and replies included in a thread
     * @return list of discussion posts and replies
     */
    public ArrayList<String> getDiscussionThreadList() {
        return discussionThreadList;
    }

    /**
     * Sets the list of discussion posts and replies included in a thread
     * @param discussionThreadList list of discussion posts and replies
     */
    public void setDiscussionThreadList(ArrayList<String> discussionThreadList) {
        this.discussionThreadList = discussionThreadList;
    }
}

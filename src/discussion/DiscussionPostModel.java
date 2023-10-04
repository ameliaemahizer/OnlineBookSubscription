package com.example.onlinebookclub.discussion;

import com.example.onlinebookclub.login.Login;

public class DiscussionPostModel {
    private Login userName;
    private String postTitle;
    private String mainPost;

    /**
     * This is the default controller for the DiscussionPostModel
     * @param userName username associated with the post
     * @param postTitle title associated with the post
     * @param mainPost main text of the post
     */

    public DiscussionPostModel (Login userName, String postTitle, String mainPost){
        this.userName = userName;
        this.postTitle = postTitle;
        this.mainPost = mainPost;
    }
}
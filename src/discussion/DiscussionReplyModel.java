package com.example.onlinebookclub.discussion;

import com.example.onlinebookclub.login.Login;

public class DiscussionReplyModel {
    private Login userName;
    private String postReply;

    /**
     * This is the default constructor for DiscussionReplyModel
     * @param userName username associated with the reply
     * @param postReply main text of the reply
     */
    public DiscussionReplyModel(Login userName, String postReply){
        this.userName = userName;
        this.postReply = postReply;
    }
}
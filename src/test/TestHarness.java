package test;

import discussion.DiscussionBoardController;
import discussion.DiscussionBoardInterface;
import login.LoginController;
import login.RegisterController;
import review.PostReviewController;
import review.ViewReviewController;


public class TestHarness {
    public static void main (String[] args){
         RegisterController rc = new RegisterController();
         LoginController lc = new LoginController();
         PostReviewController prc = new PostReviewController();
         ViewReviewController vrc = new ViewReviewController();
         DiscussionBoardController dbc = new DiscussionBoardController();

    }




}

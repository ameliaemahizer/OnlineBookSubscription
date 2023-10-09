package test;

import login.LoginController;
import login.RegisterController;
import review.PostReviewController;
import review.ViewReviewController;
import search.SearchBookController;
import subscription.PurchaseBookController;

public class TestHarness {
    public static void main (String[] args){
         RegisterController rc = new RegisterController();
         LoginController lc = new LoginController();
         PostReviewController prc = new PostReviewController();
         ViewReviewController vrc = new ViewReviewController();
         SearchBookController sc = new SearchBookController();
         PurchaseBookController pc = new PurchaseBookController();
    }

}

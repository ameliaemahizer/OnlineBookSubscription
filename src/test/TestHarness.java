package test;

import login.LoginController;
import login.RegisterController;
import org.junit.Test;
import review.PostReviewController;
import review.ViewReviewController;
import search.*;
import search.SearchBookController;
import subscription.PurchaseBookController;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


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

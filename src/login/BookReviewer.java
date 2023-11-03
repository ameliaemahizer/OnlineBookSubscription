package login;

public class BookReviewer extends UserModel {

    String reviewerID;

    /**
     * This is the default constructor for the Login class
     *
     * @param username of the book reviewer
     * @param password of the book reviewer
     */
    public BookReviewer(String username, String password, String reviewerID) {
        super(username, password);
        this.reviewerID = reviewerID;
    }

    public String getReviewerID() {
        return reviewerID;
    }

    public void setReviewerID(String reviewerID) {
        this.reviewerID = reviewerID;
    }
}

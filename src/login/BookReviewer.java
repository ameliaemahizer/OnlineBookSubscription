package login;

public class BookReviewer extends UserModel {
    String reviewerName;
    String companyName;

    public BookReviewer(String username, String password, int uniqueID,
                        String reviewerName, String companyName) {
        super(username, password, uniqueID);
        this.reviewerName = reviewerName;
        this.companyName = companyName;
    }

    public BookReviewer(String username, String password, String email, int uniqueID,
                        String reviewerName, String companyName) {
        super(username, password, email, uniqueID);
        this.reviewerName = reviewerName;
        this.companyName = companyName;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

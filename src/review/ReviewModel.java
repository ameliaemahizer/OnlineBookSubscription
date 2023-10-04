package review;

public class ReviewModel {

    public String username;
    public String reviewRating;
    public String reviewBody;

    /**
     * This is the default constructor for a review.
     * @param username the username of the review's poster
     * @param reviewRating the rating given by the review's poster
     * @param reviewBody the body written by the review's poster
     */
    public ReviewModel(String username, String reviewRating, String reviewBody) {
        this.username = username;
        this.reviewRating = reviewRating;
        this.reviewBody = reviewBody;
    }
}
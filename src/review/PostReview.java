package review;

public class PostReview {

    public String reviewBody;
    public int reviewRating;

    public String book;

    public PostReview(String reviewBody, int reviewRating, String book) {
        this.reviewBody = reviewBody;
        this.reviewRating = reviewRating;
        this.book = book;
    }

    /**
     * Gets the body of the review
     * @return Returns the body of the review
     */
    public String getReviewBody() {
        return reviewBody;
    }


    /**
     * Sets the body of the review
     * @param reviewBody sets the body of the review
     */
    public void setReviewBody(String reviewBody) {
        this.reviewBody = reviewBody;
    }

    /**
     * Gets the rating of the review
     * @return Returns the rating of the review
     */
    public int getReviewRating() {
        return reviewRating;
    }

    /**
     * Sets the rating of the review
     * @param reviewRating sets the star-rating of the review
     */
    public void setReviewRating(int reviewRating) {
        this.reviewRating = reviewRating;
    }

    /**
     * Gets book for review
     * @return returns the book for the review
     */
    public String getBook(){
        return book;
    }
}
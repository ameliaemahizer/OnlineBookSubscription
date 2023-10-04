package review;

public class ViewReview {

    public ReviewModel review;

    /**
     * This is the full constructor for the ViewReview class.
     * @param review this is the full review object
     */
    public ViewReview(ReviewModel review) {

    }

    /**
     * This is the default constructor for the ViewReview class, in case there are no reviews for a book.
     */
    public ViewReview(){

    }

    /**
     * This gets the review that will be displayed
     * @return returns the review to be displayed
     */
    public ReviewModel getReview() {
        return review;
    }
}

package discussion;

public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        DiscussionBuilder builder = new DiscussionBuilder();
        director.constructDiscussionPost(builder);
        DiscussionPostModel discussionPostModel = builder.getProduct();
    }
}

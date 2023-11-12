package discussion;

import login.UserModel;

public class Director {
    public void constructDiscussionPost(Builder builder) {
        UserModel user = new UserModel("johndoe", "password123");
        builder.getUserName(user);
        builder.setPostTitle("");
        builder.setMainPost("");
        builder.setPostReply("");
    }
}

package discussion;

import login.UserModel;

public interface Builder {
    public void setPostTitle(String postTitle);
    public void setMainPost(String mainPost);
    public void getUserName(UserModel userName);
    public void setPostReply(String postReply);
}

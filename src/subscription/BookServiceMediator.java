package subscription;

import discussion.DiscussionPostModel;
import login.Reader;
import login.UserModel;
import search.BookModel;

public interface BookServiceMediator {

    boolean deliverBook(Reader reader, BookModel book);

    void createDiscussionPost(UserModel user, BookModel book);

    void createDiscussionReply(UserModel user, DiscussionPostModel discussionPost);

}

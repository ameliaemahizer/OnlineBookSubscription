package login;

public class Author extends UserModel{
    String authorName;
    String publisher;

    public Author(String username, String password, int uniqueID, String authorName, String publisher) {
        super(username, password, uniqueID);
        this.authorName = authorName;
        this.publisher = publisher;
    }

    public Author(String username, String password, String email, int uniqueID,
                  String authorName, String publisher) {
        super(username, password, email, uniqueID);
        this.authorName = authorName;
        this.publisher = publisher;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}

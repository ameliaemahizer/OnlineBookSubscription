package login;

public class Author extends UserModel{

    String authorID;

    /**
     * This is the default constructor for the Login class
     *
     * @param username of the author account
     * @param password of the author account
     */
    public Author(String username, String password, String authorID) {
        super(username, password);
        this.authorID = authorID;
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }
}

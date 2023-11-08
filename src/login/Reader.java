package login;

public class Reader extends UserModel {
    String readerID;

    /**
     * This is the default constructor for the Login class
     *
     * @param username of the reader
     * @param password of the reader
     */
    public Reader(String username, String password, String readerID) {
        super(username, password);
        this.readerID = readerID;
    }

    public String getReaderID() {
        return readerID;
    }

    public void setReaderID(String readerID) {
        this.readerID = readerID;
    }
}

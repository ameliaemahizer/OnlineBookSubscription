package login;


public class UserModel {
    private String username;
    private String password;
    private String email;
    private int uniqueID;

    /**
     * This is the default constructor for the Login class
     **/
    public UserModel(String username, String password, int uniqueID) {
        this.username = username;
        this.password = password;
        this.uniqueID  = uniqueID;

    }

    /**
     * This is another constructor for the Login class
     */
    public UserModel(String username, String password, String email, int uniqueID){
        this.username = username;
        this.password = password;
        this.email = email;
        this.uniqueID  = uniqueID;
    }

    /**
     * This gets the username of the user
     * @return username of the account
     */
    public String getUsername() {
        return username;
    }

    /**
     * This sets the username of the user
     * @param username of the account
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This gets the username of the user
     * @return password of the account
     */
    public String getPassword() {
        return password;
    }

    /**
     * This sets the password of the user
     * @param password of the account
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This gets the email of the user
     * @return email of the account
     */
    public String getEmail() {
        return email;
    }

    /**
     * This sets the email of the user
     * @param email of the account
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This gets the unique ID for certain users
     * @return unique ID of the account (if needed)
     */
    public int getUniqueID() {
        return uniqueID;
    }

    /**
     * This sets the unique ID for certain users
     * @param uniqueID of the account (if needed)
     */
    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }
}
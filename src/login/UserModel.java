package login;


public class UserModel {
    private String username;
    private String password;
    private String email;


    /**
     * This is the default constructor for the Login class
     **/
    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * This is another constructor for the Login class
     */
    public UserModel(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
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

}
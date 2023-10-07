package login;

public class LoginAccountModel {

    public String username;

    private String password;

    /**
     * Default constructor for an account
     * @param username username of the account
     * @param password password of the account
     */
    public LoginAccountModel(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
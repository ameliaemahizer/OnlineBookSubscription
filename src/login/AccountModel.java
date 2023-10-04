package login;

public class AccountModel {

    public String username;

    private String password;

    /**
     * Default constructor for an account
     * @param username username of the account
     * @param password password of the account
     */
    public AccountModel(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
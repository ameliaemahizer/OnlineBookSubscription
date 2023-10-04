package login;

public class Register {

    private String username;
    private String password;

    /**
     * Creates users username
     * @param username creates the password for the user
     **/
    public void createUserName(String username){
        this.username = username;
    }

    /**
     * Creates users password
     * @param password creates the password for the user
     **/
    public void createPassword(String password){
        this.password = password;
    }
}
package login;

public class RegisterController {

    private User p1;
    private RegisterInterface ri;
    /**
     * default constructor for RegisterController
     */
    public RegisterController(){
        this.ri = new RegisterInterface();
        p1 = ri.displayRegisterInterface();
        int user = p1.verifyLogin();
        if (user == 1){
            System.out.println("already in the system");
        } else {
            System.out.println("not in the system");
        }
    }

    /**
     * @param username Sets the account username
     * @param password Sets the account password
     * @return currently null, but will return the created account
     */
    public LoginAccountModel createAccount(String username, String password){
        return null;
    }
}
package login;

public class LoginController {
    private User p1;

    private LoginInterface li;

    /**
     * This is the default constructor for LoginController
     */
    public LoginController() {
        this.li = new LoginInterface();
        p1 = li.displayLogin();
        int user = p1.verifyLogin();
        if (user == 1) {
            System.out.println("in system");
        }
    }

}
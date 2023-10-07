package login;

import java.util.Scanner;

public class LoginInterface {

    /**
     * This is the default constructor for LoginInterface
     */
    public LoginInterface() {

    }

    /**
     * This display the username and encrypted password
     */
    public User displayLogin(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter user name: ");
        String username = s.next();
        System.out.println("Enter password: ");
        String password = s.next();
        User l = new User(username, password);
        return l;
    }
}
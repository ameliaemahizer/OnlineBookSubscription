package login;

import java.util.Scanner;

public class RegisterInterface {
    /**
     * This is the default constructor for RegisterInterface.
     */
    public RegisterInterface(){

    }

    /**
     * displays the interface for registering a new account
     */
    public User displayRegisterInterface(){
       Scanner s = new Scanner(System.in);
       System.out.println("Enter a username: ");
       String username = s.next();
       System.out.println("Enter a password");
       String password = s.next();
       User r = new User(username, password);
       return r;
    }
}

package login;


import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private ArrayList<String> passwordList = new ArrayList<>();
    private ArrayList<String> usernameList = new ArrayList<>();

    private LoginController controller;

    /**
     * This is the default constructor for the Login class
     **/
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Gets the username returns username
     * @return a string representing the users username
     **/
    public String getUserName(){
        return username;
    }

    /**
     * Gets the Password returns password
     * @return a string representing the users password
     **/
    public String getPassword(){
        return password;
    }

    /**
     * Stores all usernames returns nothing
     * @param username and puts it into a list of all usernames
     **/
    public void storeUsernames(String username){
        this.usernameList.add(username);
    }

    /**
     * Returns all the usernames in the list
     * @return username list
     **/
    public ArrayList<String> getUsernameList() {
        return this.usernameList;
    }

    /**
     * Logs user out
     */

    public int verifyLogin(){
        if (username.equals("johndoe") && password.equals("abc123")){
            return 1;
        }else{
            return 0;
        }
    }

    public void logout(){
       System.exit(0);
    }



}
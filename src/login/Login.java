package login;


import java.util.ArrayList;

public class Login{
    private String username;
    private String password;
    private ArrayList<String> passwordList = new ArrayList<>();
    private ArrayList<String> usernameList = new ArrayList<>();


    /**
     * This is the default constructor for the Login class
     **/
    public Login() {

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
    public void logout(){

    }

}
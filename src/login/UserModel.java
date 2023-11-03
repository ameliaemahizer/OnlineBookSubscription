package login;


public class UserModel {
    private String username;
    private String password;
    private LoginController controller;

    /**
     * This is the default constructor for the Login class
     **/
    public UserModel(String username, String password) {
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
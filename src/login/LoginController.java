package login;

import java.sql.*;

public class LoginController {
    private UserModel p1;

    private LoginInterface li;

    /**
     * This is the default constructor for LoginController
     */
    public LoginController() {
        this.li = new LoginInterface();
        p1 = li.displayLogin();
        int user = p1.verifyLogin();
        if (user == 1) {
            System.out.println("Login was successful!");
        } else{
            System.out.println("Login was not successful!");
        }
    }

    public static void main(String[] args) {
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn= DriverManager.getConnection("jdbc:ucanaccess:C:\\Users\\ameli\\Desktop\\stupid\\OnlineBookSubscription\\src\\database\\BookClubDatabase1.accdb");//needs changed depending on person
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select Book.ID, Book.Title from Book");

        }
        catch(Exception ee){System.out.println(ee);}
        }
        }

}
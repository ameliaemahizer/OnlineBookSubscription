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
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://src/database/BookClubDatabase1.accdb");//needs changed depending on person
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(("select Book.ID, Book.Title, " +
                    "Genre.Genre from Book, Genre " +
                    " where Book.Genre=Genre.ID" ));
            while(rs.next()){
                System.out.println("Book ID: " + rs.getString(1)
                        + "; Name: " + rs.getString(2) + "; Genre: "
                        + rs.getString(3));
            }
            conn.commit();
            conn.close();


        } catch (Exception ee) {
            System.out.println(ee);
        }
    }
}
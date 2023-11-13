package login;

import onlinebookclub.HomePageView;
import search.BookModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class LoginView extends JFrame {
    private JPanel LoginPanel;
    private JLabel LoginTitle;
    private JLabel UserNameTitle;
    private JLabel PasswordTitle;
    private JTextField UserNameField;
    private JButton LoginButton;
    private JPasswordField PasswordField; // Use JPasswordField for password input
    private JTextField AuthField;
    private JTextField UniqueIDField;
    private JLabel UniqueIDLabel;
    private HomePageView homePageView;
    private ArrayList<BookModel> bookModels;

    public LoginView(HomePageView homePageView) {
        this.homePageView = homePageView;
        setContentPane(LoginPanel);
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);

        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AuthField.setText("");
                String login = UserNameField.getText();
                char[] passwordChars = PasswordField.getPassword(); // Get the password as char array
                String password = new String(passwordChars); // Convert char array to string
                String uniqueID = UniqueIDField.getText();

                try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    Connection conn = DriverManager.getConnection("jdbc:ucanaccess://src/database/BookClubDatabase1.accdb");
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery("select CustomerUsername, Password, UniqueID from Accounts " +
                            "where CustomerUsername = '" + login + "'");
                    if (rs.next()) {
                        if (rs.getString(2).equals(password) && rs.getString(3).equals(uniqueID)) {
                            AuthField.setText("Authenticated");
                            // Set isLoggedIn in HomePageView to true
                            homePageView.setLoggedIn(true);
                            setVisible(false);
                            dispose();
                        } else {
                            AuthField.setText("Not Authenticated");
                        }
                    } else {
                        AuthField.setText("Not Authenticated");
                    }
                    conn.commit();
                    conn.close();
                } catch (Exception ee) {
                    System.out.println(ee);
                }
            }
        });
    }
//    public static void main(String[] args) {
//        //SwingUtilities.invokeLater(() -> {
////            ArrayList<BookModel> bookModels = new ArrayList<>();
////            bookModels.add(new BookModel("It", "Stephen King", 19.99, "Horror"));
////            bookModels.add(new BookModel("Pride and Prejudice", "Jane Austen", 12.99, "Romance"));
////            bookModels.add(new BookModel("Educated: A Memoir", "Author 3", 9.99, "Non fiction"));
//
//            //HomePageView homePageView = new HomePageView(bookModels);
//            //LoginView loginView = new LoginView(homePageView);
//        //});
//    }
}

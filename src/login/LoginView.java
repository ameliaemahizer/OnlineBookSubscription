package login;

import database.dbConnect;
import onlinebookclub.HomePageView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class LoginView extends JFrame {
    private JPanel LoginPanel;
    private JLabel LoginTitle;
    private JLabel UserNameTitle;
    private JLabel PasswordTitle;
    private JTextField UserNameField;
    private JButton LoginButton;
    private JPasswordField PasswordField;
    private final HomePageView homePageView;

    private String searchTerm;
    dbConnect db = new dbConnect();

    public LoginView(HomePageView homePageView) {
        this.homePageView = homePageView;
        setContentPane(LoginPanel);
        setTitle("Login");
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);

        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login = UserNameField.getText();
                char[] passwordChars = PasswordField.getPassword(); // Get the password as char array
                String password = new String(passwordChars); // Convert char array to string


                dbConnect db = new dbConnect();
                try {
                    ResultSet rs = db.returnResult("select CustomerUsername, Password from Accounts " +
                            "where CustomerUsername = '" + login + "'");
                    while (rs.next()) {
                        if (rs.getString(2).equals(password)) {
                            setVisible(false);
                            dispose();
                            homePageView.setLoggedIn(true);

                            UserModel currentUser = new UserModel(login, password); // You can modify this based on your requirements
                            UserModel.setCurrentUser(currentUser);
                        }
                    }
                } catch (Exception ee) {
                    System.out.println(ee);
                }
            }
        });
    }
}

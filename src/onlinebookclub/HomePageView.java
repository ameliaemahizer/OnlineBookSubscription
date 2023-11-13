package onlinebookclub;

import login.LoginView;
import search.BookModel;
import search.SearchView;
import search.SearchBookController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class HomePageView extends JDialog {
    private JPanel contentPane;
    private JButton shoppingCartButton;
    private JButton subscriptionButton;
    private JButton discussionButton;
    private JButton searchButton;
    private JLabel welcomeLabel;
    private JButton buttonOK;
    private ArrayList<BookModel> bookModels;
    private boolean isLoggedIn;
    private LoginView loginView;

    public HomePageView(ArrayList<BookModel> bookModels) {
        this.bookModels = bookModels;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Online Book Club");
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Add components to the contentPane
        contentPane = new JPanel();
        contentPane.setLayout(new FlowLayout());
        welcomeLabel = new JLabel("Welcome to Online Book Club!");

        contentPane.add(welcomeLabel);
        searchButton = new JButton("Search Books");
        contentPane.add(searchButton);

        // Shopping Cart button
        shoppingCartButton = new JButton("Shopping Cart");
        contentPane.add(shoppingCartButton);

        // Subscription button
        subscriptionButton = new JButton("Subscription");
        contentPane.add(subscriptionButton);

        // Discussion button
        discussionButton = new JButton("Discussion");
        contentPane.add(discussionButton);

        // Handle the search button click
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Load book data to the SearchBookController
                SearchBookController controller = new SearchBookController(bookModels);
                SearchView searchView = new SearchView(controller);
            }
        });

        discussionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add code to open the discussion view here
            }
        });

        subscriptionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add code to open the subscription view here
            }
        });

        shoppingCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add code to open the shopping cart view here
            }
        });

        // Add the contentPane to the frame
        getContentPane().add(contentPane, BorderLayout.CENTER);

        isLoggedIn = false;
        loginView = new LoginView(this); // Create the login view
    }

    public void setLoggedIn(boolean loggedIn) {
        this.isLoggedIn = loggedIn;
        // Enable access to homepage once user logged in
        HomePageView homePageView = new HomePageView(bookModels);
        homePageView.setVisible(true);
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public static void main(String[] args) {
        ArrayList<BookModel> bookModels = new ArrayList<>();
        bookModels.add(new BookModel("It", "Stephen King", 19.99, "Horror"));
        bookModels.add(new BookModel("Pride and Prejudice", "Jane Austen", 12.99, "Romance"));
        bookModels.add(new BookModel("Educated: A Memoir", "Author 3", 9.99, "Non fiction"));

        SwingUtilities.invokeLater(() -> {
            HomePageView homePageView = new HomePageView(bookModels);
            // hide the HomePageView before login
            homePageView.setVisible(false);
        });
    }
}
